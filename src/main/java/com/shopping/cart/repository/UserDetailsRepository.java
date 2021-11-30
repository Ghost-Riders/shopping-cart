package com.shopping.cart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shopping.cart.model.UserCart;

@Repository
public interface UserDetailsRepository extends JpaRepository<UserCart, Long> {

}
