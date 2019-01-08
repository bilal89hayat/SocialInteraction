package com.social.blog.user.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.social.blog.repository.UserAddressRepository;
import com.social.blog.user.model.User;
import com.social.blog.userprofile.service.UserProfileRepository;


@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserProfileRepository userProfileRepository;

	@Autowired
	UserAddressRepository userAddressRepository;

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> findbyUserId(long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id);
	}

}
