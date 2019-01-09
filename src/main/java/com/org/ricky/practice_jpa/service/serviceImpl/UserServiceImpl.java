package com.org.ricky.practice_jpa.service.serviceImpl;

import com.org.ricky.practice_jpa.model.InvalidValueException;
import com.org.ricky.practice_jpa.model.NotFoundException;
import com.org.ricky.practice_jpa.model.User;
import com.org.ricky.practice_jpa.repository.UserRepository;
import com.org.ricky.practice_jpa.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User createUser(User user) {
		if (userRepository.findUserById(user.getId()) != null) {
			throw new InvalidValueException("user has been created!");
		}
		return userRepository.save(user);
	}

	@Override
	public List<User> readAllUser() {
		return userRepository.findAll();
	}

	@Override
	public User readUser(Integer id) {
		return userRepository.findUserById(id);
	}

	@Override
	public User updateUser(User user) {
		if (userRepository.findUserById(user.getId()) == null) {
			throw new NotFoundException("user want to update is not found");
		}
		return userRepository.save(user);
	}

	@Override
	public ResponseEntity deleteUser(Integer id) {
		if (userRepository.findUserById(id) == null) {
			throw new NotFoundException("user want to delete is not found");
		}
		userRepository.delete(id);
		return ResponseEntity.ok().build();
	}
}
