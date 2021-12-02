package com.shopping.cart.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.cart.model.CartProductEntity;
import com.shopping.cart.repository.CartProductEntityRepository;
import com.shopping.cart.service.CartProductEntityService;

@Service
public class CartProductEntityServiceImpl implements CartProductEntityService {

	@Autowired
	private CartProductEntityRepository cartProductEntityRepository;

	@Override
	public List<CartProductEntity> findAll() {
		List<CartProductEntity> cartProductEntities = cartProductEntityRepository.findAll();
		return cartProductEntities;
	}

}
