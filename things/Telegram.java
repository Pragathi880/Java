package com.xworkz.september.things;

import java.util.Date;

public class Telegram {
	public String userName;
	public String password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accountCreatedDate;
	public String gender;
	
	public Telegram() {
		this(new Date() , "Female");
		System.out.println();
	}
	
	public Telegram(String userName) {
		System.out.println("This is Constructor of class Telegram with 1-args");
		this.userName = userName;
		System.out.println("User Name:"+this.userName);
	}
	
	public Telegram(String password,String email) {
		this("Kavitha");
		System.out.println("This is Constructor of class Telegram with 2-args");
		this.password = password;
		this.email = email;
		System.out.println("password:"+this.password+"  "+"Email:"+this.email);
	}
	
	public Telegram(long contactNumber,String address) {
		this("Kavitha123","kavitha@gmail.com");
	    System.out.println("This is Constructor of class Telegram with 2-args");
		this.contactNumber = contactNumber;
		this.address = address;
		System.out.println("Contact Number:"+this.contactNumber+"  "+"Address:"+this.address);
	}
	
	public Telegram(Date accountCreatedDate,String gender) {
		this(825272616, "Kenkere");
		System.out.println("This is Constructor of class Telegram with 2-args");
		this.accountCreatedDate = accountCreatedDate;
		this.gender = gender;
		System.out.println("Account created date:"+this.accountCreatedDate+"  "+"Gender:"+this.gender);
	}
	
	}

