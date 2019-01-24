package com.org.ricky.practice_jpa.controller;

import com.org.ricky.practice_jpa.model.Driver;
import com.org.ricky.practice_jpa.model.User;
import com.org.ricky.practice_jpa.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/api")
@RestController
public class DriverController {

	@Autowired
	DriverService driverService;

	@GetMapping("/driver")
	public String helloDriver() {
		return "Hello-Drivers!";
	}

	@GetMapping("/driver/{id}")
	public Driver findDriver(@PathVariable("id") Integer id){
		return driverService.readDriver(id);
	}

	@PostMapping("/driver")
	public Driver createDriver(@RequestBody Driver driver){
		return driverService.createDriver(driver);
	}

	@PutMapping("/driver")
	public Driver updateDriver(@RequestBody Driver driver) {
		return driverService.updateDriver(driver);
	}

	@DeleteMapping("/driver/{id}")
	public ResponseEntity deleteDriver(@PathVariable("id") Integer id) {
		return driverService.deleteDriver(id);
	}
}
