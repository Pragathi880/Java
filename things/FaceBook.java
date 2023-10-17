package com.xworkz.september.things;

import java.util.Date;

public class FaceBook {
	public String userName;
	public String password;
	public String email;
	public long contactNumber;
	public String address;
	public Date accountCreatedDate;
	public String gender;

	public FaceBook() {
		this(new Date() , "Female");
		System.out.println();
	}
	
	public FaceBook(String userName) {
		System.out.println("This is Constructor of class FaceBook with 1-args");
		this.userName = userName;
		System.out.println("User Name:"+this.userName);
	}
	
	public FaceBook(String password,String email) {
		this("pragathi");
		System.out.println("This is Constructor of class FaceBook with 2-args");
		this.password = password;
		this.email = email;
		System.out.println("password:"+this.password+"  "+"Email:"+this.email);
	}
	
	public FaceBook(long contactNumber,String address) {
		this("pragathi","pragathirajshekar@gmail.com");
	    
		System.out.println("This is Constructor of class FaceBook with 2-args");
		this.contactNumber = contactNumber;
		this.address = address;
		System.out.println("Contact Number:"+this.contactNumber+"  "+"Address:"+this.address);
	}
	
	public FaceBook(Date accountCreatedDate,String gender) {
		this(935373772, "tumkur");
		
		System.out.println("This is Constructor of class FaceBook with 2-args");
		this.accountCreatedDate = accountCreatedDate;
		this.gender = gender;
		System.out.println("Account created date:"+this.accountCreatedDate+"  "+"Gender:"+this.gender);
	}
	

	
}
