package com.org.ricky.practice_jpa.repository;

import com.org.ricky.practice_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

	User findUserById(Integer id);
//	List<User> findUserByBalanceGreaterThanEqual();

}
