package com.org.ricky.practice_jpa.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "drivers")
public class Driver {

	@Id
	@GeneratedValue
//	@OneToMany(mappedBy = "driver")
	private Integer id;

	private String name;

	private Integer balance;

	private Float rating;

	private DriverStatus driverStatus;


}
