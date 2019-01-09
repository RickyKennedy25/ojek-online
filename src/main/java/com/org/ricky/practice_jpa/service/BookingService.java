package com.org.ricky.practice_jpa.service;

import com.org.ricky.practice_jpa.model.Booking;
import com.org.ricky.practice_jpa.model.Driver;
import org.springframework.http.ResponseEntity;

public interface BookingService {
	Booking createBooking(Booking booking);
	Booking updateBooking (Booking booking);
	Booking readBooking(Integer idBooking);
	ResponseEntity deleteBooking(Integer idBooking);
}
