package com.shopping.cart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shopping.cart.model.CartProductEntity;
import com.shopping.cart.model.UserCartEntity;
import com.shopping.cart.model.UserEntity;
import com.shopping.cart.service.CartProductEntityService;
import com.shopping.cart.service.UserEntityService;

@Controller
public class HomeController {
	@Autowired
	private UserEntityService userEntityService;

	@Autowired
	private CartProductEntityService cartProductEntityService;

	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}

	@PostMapping({ "/authenticate" })
	public String authenticate(@RequestParam("username") String username, @RequestParam("password") String password,
			Model model) {

		Optional<UserEntity> userEntity = userEntityService.findByUsernameAndPassword(username, password);
		if (userEntity.isPresent()) {
			int id = userEntity.get().getId();
			model.addAttribute("di", id);
			model.addAttribute("name", userEntity.get().getUsername());
			return "index";
		}
		return "error";

	}

	@GetMapping({ "/home" })
	public String hello(Model model) {
		// user data
		UserEntity userEntity = userEntityService.findById(25);
		int id = userEntity.getId();
		model.addAttribute("di", id);
		model.addAttribute("name", userEntity.getUsername());
		return "index";
	}

	@GetMapping("/cart")
	public String cartHome(@RequestParam(name = "di", required = false) Integer id, Model model) {
		UserEntity userEntity = userEntityService.findById(id);
		UserCartEntity userCartEntity = userEntity.getUserCartEntity();
		model.addAttribute("di", id);
		model.addAttribute("products", userCartEntity);
		return "cart";
	}

	@GetMapping("/product")
	public String productHome(@RequestParam(name = "di", required = false) Integer id, Model model) {
		List<CartProductEntity> list = cartProductEntityService.findAll();
		model.addAttribute("di", id);
		model.addAttribute("prodList", list);
		return "product";
	}

	/// testing for query param
	@GetMapping("/products")
	public ModelAndView productAddToHome(@RequestParam(name = "id", required = false) Integer id,
			@RequestParam(name = "di", required = false) Integer di, ModelAndView model) {
		System.out.println("Given id: " + id + "\n di: " + di);
		model.setViewName("redirect:/cart?di=" + di);
		return model;
	}

}
