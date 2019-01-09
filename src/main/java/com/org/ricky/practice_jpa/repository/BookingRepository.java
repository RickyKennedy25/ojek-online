package com.org.ricky.practice_jpa.repository;

import com.org.ricky.practice_jpa.model.Booking;
import com.org.ricky.practice_jpa.model.Driver;
import com.org.ricky.practice_jpa.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BookingRepository extends JpaRepository<Booking, Integer> {

	Booking findBookingById(Integer id);
	List<Booking> findBookingByCustomer(User customer);
	List<Booking> findBookingByDriver(Driver driver);

}
