package com.org.ricky.practice_jpa.service.serviceImpl;

import com.org.ricky.practice_jpa.model.Booking;
import com.org.ricky.practice_jpa.model.InvalidValueException;
import com.org.ricky.practice_jpa.model.NotFoundException;
import com.org.ricky.practice_jpa.repository.BookingRepository;
import com.org.ricky.practice_jpa.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService {

	@Autowired
	BookingRepository bookingRepository;

	@Override
	public Booking createBooking(Booking booking) {
		if (bookingRepository.findBookingById(booking.getId()) != null) {
			throw new InvalidValueException("booking has been created!");
		}
		return bookingRepository.save(booking);
	}

	@Override
	public Booking updateBooking(Booking booking) {
		if (bookingRepository.findBookingById(booking.getId()) == null) {
			throw new NotFoundException("booking want to update is not found");
		}
		return bookingRepository.save(booking);
	}

	@Override
	public Booking readBooking(Integer idBooking) {
		return bookingRepository.findBookingById(idBooking);
	}

	@Override
	public ResponseEntity deleteBooking(Integer idBooking) {
		if (bookingRepository.findBookingById(idBooking) == null) {
			throw new NotFoundException("booking want to delete is not found");
		}
		bookingRepository.delete(idBooking);
		return ResponseEntity.ok().build();
	}
}
