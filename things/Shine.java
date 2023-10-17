package com.xworkz.september.things;

import java.util.Date;

public class Shine {
	public String userName;
	public String password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accountCreatedDate;
	public String gender;
	
	public Shine() {
		this(new Date() , "Male");
		System.out.println();
	}
	
	public Shine(String userName) {
		System.out.println("This is Constructor of class Telegram with 1-args");
		this.userName = userName;
		System.out.println("User Name:"+this.userName);
	}
	
	public Shine(String password,String email) {
		this("Raju");
		System.out.println("This is Constructor of class Telegram with 2-args");
		this.password = password;
		this.email = email;
		System.out.println("password:"+this.password+"  "+"Email:"+this.email);
	}
	
	public Shine(long contactNumber,String address) {
		this("Raju123","raju435@gmail.com");
	    System.out.println("This is Constructor of class Telegram with 2-args");
		this.contactNumber = contactNumber;
		this.address = address;
		System.out.println("Contact Number:"+this.contactNumber+"  "+"Address:"+this.address);
	}
	
	public Shine(Date accountCreatedDate,String gender) {
		this(826252572, "Huliyar");
		System.out.println("This is Constructor of class Telegram with 2-args");
		this.accountCreatedDate = accountCreatedDate;
		this.gender = gender;
		System.out.println("Account created date:"+this.accountCreatedDate+"  "+"Gender:"+this.gender);
	}
	




}
