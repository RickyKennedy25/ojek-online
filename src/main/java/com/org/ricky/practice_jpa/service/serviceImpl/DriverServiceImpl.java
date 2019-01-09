package com.org.ricky.practice_jpa.service.serviceImpl;

import com.org.ricky.practice_jpa.model.Driver;
import com.org.ricky.practice_jpa.model.InvalidValueException;
import com.org.ricky.practice_jpa.model.NotFoundException;
import com.org.ricky.practice_jpa.repository.DriverRepository;
import com.org.ricky.practice_jpa.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {

	@Autowired
	DriverRepository driverRepository;

	@Override
	public Driver createDriver(Driver driver) {
		if (driverRepository.findDriverById(driver.getId()) != null) {
			throw new InvalidValueException("Driver has been registered");
		}
		return driverRepository.save(driver);
	}

	@Override
	public Driver updateDriver(Driver driver) {
		if (driverRepository.findDriverById(driver.getId()) == null) {
			throw new NotFoundException("driver want to update is not found");
		}
		return driverRepository.save(driver);
	}

	@Override
	public Driver readDriver(Integer idDriver) {
		return driverRepository.findDriverById(idDriver);
	}

	@Override
	public ResponseEntity deleteDriver(Integer idDriver) {
		if (driverRepository.findDriverById(idDriver) == null) {
			throw new NotFoundException("driver want to delete is not found");
		}
		driverRepository.delete(idDriver);
		return ResponseEntity.ok().build();
	}

}
