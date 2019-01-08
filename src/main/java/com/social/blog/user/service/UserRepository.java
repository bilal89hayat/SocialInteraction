package com.social.blog.user.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.blog.user.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	
	User findByEmail(String email);
	
	

}
