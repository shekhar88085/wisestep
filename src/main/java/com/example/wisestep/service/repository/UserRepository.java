package com.example.wisestep.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.wisestep.model.User;

@Repository("userRepository")
public interface UserRepository extends CrudRepository<User, String>{
	User findByEmailIdIgnoreCase(String emailId);
}
