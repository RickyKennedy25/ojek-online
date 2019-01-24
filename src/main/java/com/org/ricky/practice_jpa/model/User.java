package com.org.ricky.practice_jpa.model;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue
//	@OneToMany(mappedBy = "customer")
	private Integer id;

	private String username;

	private String name;

	private Integer balance;
}
