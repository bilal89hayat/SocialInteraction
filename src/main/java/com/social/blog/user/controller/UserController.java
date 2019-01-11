package com.social.blog.user.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.social.blog.user.model.User;
import com.social.blog.user.model.UserProfile;
import com.social.blog.user.service.UserService;
import com.social.blog.userprofile.service.UserProfileService;


@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserProfileService userProfileService;
	
	ObjectMapper mapper = new ObjectMapper();

	@PostMapping("/users") // is working//
	public User createUser(@Valid @RequestBody User user) throws JsonProcessingException {

		System.out.println("user : " + mapper.writeValueAsString(user));

		return userService.saveUser(user);
	}

	@PostMapping("/usersprofile") // is working
	public UserProfile createUser(@Valid @RequestBody UserProfile userp) throws JsonProcessingException {

		System.out.println("user : " + mapper.writeValueAsString(userp));

		return userProfileService.saveUserProfile(userp);
	}

	@GetMapping("/user/{email}") // working
	public User findbyemail(@PathVariable String email) {
		return userService.findByEmail(email);

	}

	@GetMapping("/users") // is working
	public List<User> getAllUsers() {
		return userService.findAllUsers();
	}

	@GetMapping("/users/{id}") // not working
	public Optional<User> getUsersById(@PathParam("id") Long id) {
		return userService.findbyUserId(id);

	}

	@GetMapping("/usersprofile") // is working
	public List<UserProfile> getAllUsersProfile() {
		return userProfileService.findAllUserProfiles();
	}

	/*@GetMapping("/usersprofile/{id}") // not working
	public Optional<UserProfile> getUsersProfileById(@PathParam("id") Long id) {
		return userProfileService.findbyId(id);
	}
*/
	/*@GetMapping("/userAddress") // working
	public List<UserAddress> getUserAddress() {
		return userAddressRepository.findAll();
	}

	@GetMapping("/usersAddress/{city}")
	public List<UserAddress> getbyCity(@PathVariable String city) {
		return userAddressRepository.findByCity(city);

	}
*/
}
