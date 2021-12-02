package com.shopping.cart.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.cart.model.UserEntity;
import com.shopping.cart.repository.UserEntityRepository;
import com.shopping.cart.service.UserEntityService;

@Service
public class UserEntityServiceImpl implements UserEntityService {

	@Autowired
	private UserEntityRepository entityRepository;

	@Override
	public UserEntity createUserEntity(UserEntity userEntity) {
		UserEntity persistedUserEntity = entityRepository.save(userEntity);
		return persistedUserEntity;
	}

	@Override
	public List<UserEntity> findAllUserEntity() {
		List<UserEntity> listUserEntities = entityRepository.findAll();
		return listUserEntities;
	}

	@Override
	public UserEntity findById(int id) {
		Optional<UserEntity> userEntity = entityRepository.findById(id);
		if (!userEntity.isPresent()) {
			return null;
		}
		return userEntity.get();
	}

}
