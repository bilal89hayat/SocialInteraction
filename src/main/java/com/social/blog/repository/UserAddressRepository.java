package com.social.blog.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.social.blog.user.model.UserAddress;

public interface UserAddressRepository extends JpaRepository<UserAddress, Long>{
	
	List<UserAddress> findByCity(String city);

}
