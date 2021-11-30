package com.shopping.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.cart.model.UserCart;

@Repository
public interface UserCartRepository extends JpaRepository<UserCart, Long> {

}
