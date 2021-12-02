package com.shopping.cart.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@GetMapping({ "/", "/home" })
	public String hello(Model model) {
		// user data
		UserEntity userEntity = userEntityService.findById(25);
		model.addAttribute("name", userEntity.getUsername());
		return "index";
	}

	@GetMapping("/cart")
	public String cartHome(Model model) {
		UserEntity userEntity = userEntityService.findById(25);
		UserCartEntity userCartEntity = userEntity.getUserCartEntity();
		model.addAttribute("products", userCartEntity);
		return "cart";
	}

	@GetMapping("/product")
	public String productHome(Model model) {
		List<CartProductEntity> list = cartProductEntityService.findAll();
		model.addAttribute("prodList", list);
		return "product";
	}

	/// testing for query param
	@GetMapping("/products")
	public void productAddToHome(@RequestParam(name = "id", required = false) String id, HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Given id: " + id);
		String username = (String) request.getAttribute("username");
		System.out.println("user name: " + username);
		request.getRequestDispatcher("/product").forward(request, response);
	}

}
