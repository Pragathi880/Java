package com.xworkz.september.driver;

import com.xworkz.september.things.Instagram;

public class InstagramRunner {
	public static void main(String []args) {
		System.out.println("To set the Instagarm profile");
		Instagram insta = new Instagram();
		insta.userName="Pragathi R";
		insta.password="*********";
		insta.isProfileSet=true;
		insta.phoneNumber=9353737724l;
		insta.emailId="pragathirajshekar@gmail.com";
		insta.dateOfBirth="18/09/2001";
		insta.location="Banglore";
		insta.gender="Female";
		insta.age=22;
		insta.accountType="Personal";
		
		System.out.println(insta.userName);
		System.out.println(insta.password);
		System.out.println(insta.isProfileSet);
		System.out.println(insta.phoneNumber);
		System.out.println(insta.emailId);
		System.out.println(insta.dateOfBirth);
		System.out.println(insta.location);
		System.out.println(insta.gender);
		System.out.println(insta.age);
		System.out.println(insta.accountType);
		
		System.out.println("If profile set Display the account type and username:");
		
		if (insta.isProfileSet=true) {
			System.out.println(insta.accountType +"   "+insta.userName);
		}
		
		
		System.out.println("If location is banglore display all the details:");
		
		if(insta.location =="Banglore") {
			System.out.println("Print all the details");
			System.out.println("UserName :" +insta.userName );
			System.out.println("Password:" +insta.password);
			System.out.println("Is Profile Set:" +insta.isProfileSet);
			System.out.println("Phone number:" +insta.phoneNumber);
			System.out.println("Email ID:" +insta.emailId);
			System.out.println("Date of Birth:" +insta.dateOfBirth);
			System.out.println("Location:" +insta.location);
			System.out.println("Gender:" +insta.gender);
			System.out.println("Age:" +insta.age);
			System.out.println("Account Type:" +insta.accountType);
			
		}
		
		System.out.println("To check if profile is set or not:");
		
		if(insta.password=="null") {
			System.out.println("Password:" +insta.password);
		}

	}
}
