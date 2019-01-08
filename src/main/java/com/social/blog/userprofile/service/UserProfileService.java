package com.social.blog.userprofile.service;

import java.util.List;
import java.util.Optional;

import com.social.blog.user.model.UserProfile;



public interface UserProfileService {

	public UserProfile saveUserProfile(UserProfile userProfile);

	public List<UserProfile> findAllUserProfiles();

	//public Optional<UserProfile> findbyId(Long id);
	
	

}
