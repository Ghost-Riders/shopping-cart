package com.shopping.cart.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.cart.model.Products;
import com.shopping.cart.repository.ProductRepository;
import com.shopping.cart.service.ProductService;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Products saveProduct(Products products) {

		return productRepository.save(products);

	}

}
