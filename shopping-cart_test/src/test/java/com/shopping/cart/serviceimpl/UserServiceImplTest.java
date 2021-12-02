//package com.shopping.cart.serviceimpl;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import javax.persistence.NoResultException;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.shopping.cart.model.UserCart;
//import com.shopping.cart.model.UserDetails;
//import com.shopping.cart.service.UserService;
//
//@Transactional
//class UserServiceImplTest {
//	@Autowired
//	private UserService userService;
//
//	@Test
//	void test() {
//		Long id = 1L;
//		Exception e = null;
//		UserDetails userDetail = null;
//		try {
//			userDetail = userService.findOne(id);
//			System.out.println(userDetail);
//		} catch (Exception ex) {
//			e = ex;
//		}
//		assertEquals(1, userDetail.getId());
//	}
//
//	@Test
//	void save() {
//		long id = 1;
//		Exception e = null;
//		try {
//			UserDetails saveuser = new UserDetails();
//			saveuser.setName("manmath");
//			saveuser.setUsername("man");
//			saveuser.setPassword("man");
//			saveuser.setAddress("pune");
//			saveuser.setContact("pune");
//
//			UserCart cart = new UserCart();
//			cart.setFare(1f);
//			cart.setQuantity("2");
//			saveuser.setUserCart(cart);
//
//			cart.setProduct(null);
//
//			UserDetails userDetail = userService.saveUserRegistry(saveuser);
//			System.out.println(userDetail);
//		} catch (Exception ex) {
//			e = ex;
//		}
//		assertTrue(e instanceof NoResultException);
//	}
//
//}
