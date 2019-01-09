package com.org.ricky.practice_jpa.service;


import com.org.ricky.practice_jpa.model.Driver;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


public interface DriverService {

	Driver createDriver (Driver driver);
	Driver updateDriver (Driver driver);
	Driver readDriver(Integer idDriver);
	ResponseEntity deleteDriver(Integer idDriver);
}
