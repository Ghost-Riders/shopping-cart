package com.shopping.cart.service;

import java.util.List;
import java.util.Optional;

import com.shopping.cart.model.UserEntity;

public interface UserEntityService {

	UserEntity createUserEntity(UserEntity userEntity);

	List<UserEntity> findAllUserEntity();

	UserEntity findById(int id);

	Optional<UserEntity> findByUsernameAndPassword(String username, String password);

}
