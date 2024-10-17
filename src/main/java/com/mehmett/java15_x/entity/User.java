package com.mehmett.java15_x.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;

import java.time.LocalDate;

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String username;
	String password;
	String name;
	String email;
	String avatar;
	String about;
	Integer followCount;
	Integer folowingCount;
	Integer locationId;
	LocalDate dogumTarihi;
	LocalDate memberDate;
	Long createAt;
	Long updateAt;
	AccountState accountState;
	

	
}