package com.shopping.cart;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.shopping.cart.model.CartProductEntity;
import com.shopping.cart.model.UserCartEntity;
import com.shopping.cart.model.UserEntity;
import com.shopping.cart.repository.AparalRepository;
import com.shopping.cart.repository.BookRepository;
import com.shopping.cart.service.ProductService;
import com.shopping.cart.service.UserEntityService;

@SpringBootApplication
@EnableTransactionManagement
public class ShoppingCartApplication extends SpringBootServletInitializer implements CommandLineRunner {

	@Autowired
	private ProductService impl;

	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private AparalRepository aparalRepository;

	@Autowired
	private UserEntityService userEntityService;

	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
//		Products product = new Products();
//		product.setProductId(2l);
//		product.setProductName("Aparal");
//		product.setFare(101010f);
//
//		Book book = new Book();
//		book.setGenre("HH");
//		book.setAuther("HH");
//		book.setPublications("HH");
//
//		Aparal aparal = new Aparal();
//		aparal.setBrand("YO");
//		aparal.setDesign("YO");
//		aparal.setType("YO");
//
//		Products prd = impl.saveProduct(product);
//		bookRepository.save(book);
//		aparalRepository.save(aparal);
//		System.out.println(prd.getFare());

//		UserEntity userEntity = new UserEntity("test1", "test1");
//		userEntityService.createUserEntity(userEntity);

//		UserEntity userEntity1 = new UserEntity("test2", "test2");
//		userEntity1.setId(16);
//		UserCartEntity userCartEntity = new UserCartEntity("Book", 2, 100f);
//		userCartEntity.setId(19);
//		userEntity1.setUserCartEntity(userCartEntity);
//		userEntityService.createUserEntity(userEntity1);

//		//user data
//		UserEntity userEntity = userEntityService.findById(25);
//
//		//cart data from user
//		UserCartEntity cartEntity = userEntity.getUserCartEntity();
//		//product 1
//		CartProductEntity cartProductEntity = new CartProductEntity(1, 10.0F, 2);
//		//product 2
//		CartProductEntity cartProductEntity1 = new CartProductEntity(2, 10.0F, 2);
//		//added aall prod to list
//		List<CartProductEntity> list = new ArrayList<CartProductEntity>();
//		list.add(cartProductEntity);
//		list.add(cartProductEntity1);
//		//prod set to cart
//		cartEntity.setCartProductEntities(list);
//		//cart set to user
//		UserEntity updateUserEntity=userEntityService.createUserEntity(userEntity);
//		System.out.println(updateUserEntity.getUserCartEntity().getCartProductEntities().get(0).getAvailableQuantity());

	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

		return builder.sources(ShoppingCartApplication.class);
	}

}
