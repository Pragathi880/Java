package com.xworkz.september.things;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Company1 {
	private String NameOfCompany;
	private int YearOfWstablishment;
	private float salary;
	private String designation;
	public Company1(String nameOfCompany, int yearOfWstablishment, float salary, String designation) {
		super();
		NameOfCompany = nameOfCompany;
		YearOfWstablishment = yearOfWstablishment;
		this.salary = salary;
		this.designation = designation;
	}
	
	

}
