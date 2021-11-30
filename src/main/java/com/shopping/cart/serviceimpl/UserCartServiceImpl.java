package com.shopping.cart.serviceimpl;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.cart.model.UserCart;
import com.shopping.cart.repository.UserCartRepository;
import com.shopping.cart.service.UserCartService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserCartServiceImpl implements UserCartService {

	@Autowired
	private UserCartRepository userCartRepository;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public UserCart updateCart(UserCart userCart) {
		UserCart persistUserCart = userCartRepository.save(userCart);
		if (persistUserCart.getId() == null) {
			throw new NoResultException("Not able to persist");
		}
		return persistUserCart;
	}

}
