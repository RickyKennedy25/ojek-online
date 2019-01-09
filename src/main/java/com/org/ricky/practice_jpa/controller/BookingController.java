package com.org.ricky.practice_jpa.controller;

import com.org.ricky.practice_jpa.model.Booking;
import com.org.ricky.practice_jpa.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookingController {

	@Autowired
	BookingService bookingService;

	@GetMapping("/booking")
	public String helloBooking() {
		return "Hello-Booking!";
	}

	@GetMapping("/booking/{id}")
	public Booking findBooking(@PathVariable("id") Integer id){
		return bookingService.readBooking(id);
	}

	@PostMapping("/booking")
	public Booking createBooking(@RequestBody Booking booking){
		return bookingService.createBooking(booking);
	}

	@PutMapping("/booking")
	public Booking updateBooking(@RequestBody Booking booking) {
		return bookingService.updateBooking(booking);
	}

	@DeleteMapping("/booking/{id}")
	public ResponseEntity deleteBooking(@PathVariable("id") Integer id) {
		return bookingService.deleteBooking(id);
	}

}
