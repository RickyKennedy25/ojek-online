package com.org.ricky.practice_jpa.controller;

import com.org.ricky.practice_jpa.model.User;
import com.org.ricky.practice_jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/user")
	public String helloUser() {
		return "Hello User!";
	}

	@GetMapping("/user/all")
	public List<User> findAllUser() {
		return userService.readAllUser();
	}

	@GetMapping("/user/{id}")
	public User findUser(@PathVariable("id") Integer id){
		return userService.readUser(id);
	}

	@PostMapping("/user")
	public User createUser(@RequestBody User user){
		return userService.createUser(user);
	}

	@PutMapping("/user")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/user/{id}")
	public ResponseEntity deleteUser(@PathVariable("id") Integer id) {
		return userService.deleteUser(id);
	}
}
