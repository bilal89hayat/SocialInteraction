package com.social.blog.userprofile.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.social.blog.user.model.UserProfile;


@Service
@Transactional
public class UserProfileServiceImpl implements UserProfileService{
	
	
	
	@Autowired
	UserProfileRepository userProfileRepository;

	@Override
	public UserProfile saveUserProfile(UserProfile userProfile) {
		// TODO Auto-generated method stub
		return userProfileRepository.save(userProfile);
	}

	@Override
	public List<UserProfile> findAllUserProfiles() {
		// TODO Auto-generated method stub
		return userProfileRepository.findAll();
	}

	/*@Override
	public Optional<UserProfile> findbyId(Long id) {
		// TODO Auto-generated method stub
		return userProfileRepository.findById(id);
	}*/

}
