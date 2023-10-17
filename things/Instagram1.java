package com.xworkz.september.things;

import java.util.Date;

public class Instagram1 {
	public String userName;
	public String password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accountCreatedDate;
	public String gender;
	
	public Instagram1() {
		this(new Date() , "Male");
		System.out.println();
	}
	
	public Instagram1(String userName) {
		System.out.println("This is Constructor of class Instagram with 1-args");
		this.userName = userName;
		System.out.println("User Name:"+this.userName);
	}
	
	public Instagram1(String password,String email) {
		this("Chandan");
		System.out.println("This is Constructor of class Instagram with 2-args");
		this.password = password;
		this.email = email;
		System.out.println("password:"+this.password+"  "+"Email:"+this.email);
	}
	
	public Instagram1(long contactNumber,String address) {
		this("chandu345","chandan@gmail.com");
	    System.out.println("This is Constructor of class Instagram with 2-args");
		this.contactNumber = contactNumber;
		this.address = address;
		System.out.println("Contact Number:"+this.contactNumber+"  "+"Address:"+this.address);
	}
	
	public Instagram1(Date accountCreatedDate,String gender) {
		this(935373772, "Mysore");
		System.out.println("This is Constructor of class Instagram with 2-args");
		this.accountCreatedDate = accountCreatedDate;
		this.gender = gender;
		System.out.println("Account created date:"+this.accountCreatedDate+"  "+"Gender:"+this.gender);
	}
	
}
