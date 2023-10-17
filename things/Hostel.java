package com.xworkz.september.things;

public class Hostel {
	public String hostelName;
	public int numOfStudents;
	
	public Hostel(){
		System.out.println("This is Default Constructor");
	}
	 public Hostel(String hostelName){
		 this.hostelName=hostelName;
		 System.out.println("Hostel Name:"+this.hostelName);
	}
	
	

}
