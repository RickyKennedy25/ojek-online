package com.org.ricky.practice_jpa.service;

import com.org.ricky.practice_jpa.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService  {

	User createUser(User user);
	List<User> readAllUser();
	User readUser(Integer id);
	User updateUser(User user);
	ResponseEntity deleteUser(Integer id);

}
