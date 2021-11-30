package com.shopping.cart.serviceimpl;

import java.util.Optional;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.shopping.cart.model.UserDetails;
import com.shopping.cart.repository.UserDetailsRepository;
import com.shopping.cart.service.UserService;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDetailsRepository userDetailsRepository;

	@Override
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public UserDetails saveUserRegistry(UserDetails userDetails) {
		UserDetails persistedUserDetails = userDetailsRepository.save(userDetails);
		if (persistedUserDetails == null) {
			throw new NoResultException();
		}
		return persistedUserDetails;
	}

	@Override
	public UserDetails findOne(long id) {
		Optional<UserDetails> userDetail = userDetailsRepository.findById(id);
		System.out.println(userDetail.isPresent());
//		if (!userDetail.isPresent()) {
//			throw new NoResultException("No Entity Found");
//		}
		return userDetail.get();
	}

}
