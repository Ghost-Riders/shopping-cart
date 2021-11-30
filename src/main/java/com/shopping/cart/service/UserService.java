package com.shopping.cart.service;

import com.shopping.cart.model.UserDetails;

public interface UserService {
	UserDetails findOne(long id);

	UserDetails saveUserRegistry(UserDetails userDetails);
}
