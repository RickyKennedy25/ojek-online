package com.org.ricky.practice_jpa.repository;

import com.org.ricky.practice_jpa.model.Driver;
import com.org.ricky.practice_jpa.model.DriverStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DriverRepository extends JpaRepository<Driver, Integer> {

	List<Driver> findAllByDriverStatus(DriverStatus driverStatus);
	Driver findDriverById(Integer id);


}
