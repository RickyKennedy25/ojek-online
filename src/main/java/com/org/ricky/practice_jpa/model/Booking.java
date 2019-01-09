package com.org.ricky.practice_jpa.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "bookings")
public class Booking {

	@Id
	@GeneratedValue
	private Integer id;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "customer")
	private User customer;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "driver")
	private Driver driver;

	private Integer price;

	private Date date;

	private BookingStatus bookingStatus;
}
