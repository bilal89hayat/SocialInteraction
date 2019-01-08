package com.social.blog.userprofile.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.social.blog.user.model.UserProfile;

public interface UserProfileRepository extends JpaRepository<UserProfile, Long>{

}
