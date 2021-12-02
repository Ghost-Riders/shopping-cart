package com.shopping.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.cart.model.CartProductEntity;

@Repository
public interface CartProductEntityRepository extends JpaRepository<CartProductEntity, Integer> {

}
