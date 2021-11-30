package com.shopping.cart.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shopping.cart.model.Products;
import com.shopping.cart.model.UserCart;
import com.shopping.cart.model.UserDetails;

@Controller
public class HomeController {

	private static UserDetails userDetails;
	private static UserCart cart;
	private static Products products;
	private static List<Products> cartProducts;
	static {
		userDetails = new UserDetails();
		userDetails.setId(10L);
		userDetails.setName("Manmath");
		userDetails.setUsername("manmath");
		userDetails.setPassword("manmath");
		userDetails.setContact("+91 0000000000");
		userDetails.setAddress("Nanded");
	}
	static {
		cartProducts = new ArrayList<Products>();
		Products p1 = new Products();
		p1.setProductId(1L);
		p1.setProductName("Mobile");
		p1.setFare(10000f);
		Products p2 = new Products();
		p2.setProductId(2L);
		p2.setProductName("Laptop");
		p2.setFare(40000f);

		cartProducts.add(p1);
		cartProducts.add(p2);
	}

	@GetMapping({ "/", "/home" })
	public String hello(@RequestParam(value = "name", defaultValue = "world", required = true) String name,
			Model model) {
		model.addAttribute("name", name);
		return "index";
	}

	@GetMapping("/cart")
	public String cartHome(Model model) {
		model.addAttribute("products", cartProducts);
		return "cart";
	}
}
