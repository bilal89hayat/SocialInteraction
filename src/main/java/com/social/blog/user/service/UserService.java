package com.social.blog.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.social.blog.user.model.User;

public interface UserService {
	
	public User findByEmail(String email);
	
	public User saveUser(User user);
	
	public List<User> findAllUsers();
	
	public Optional<User> findbyUserId(long id);
	}
