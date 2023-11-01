package com.xworkz.september.things;

public class Employee extends Company1 {
	public Employee() {
	super("Accenture",1995,400000,"Software Developer");
	System.out.println("This is derived class constructor");
	System.out.println(super.getNameOfCompany());
	System.out.println(super.getYearOfWstablishment());
	System.out.println(super.getSalary());
	System.out.println(super.getDesignation());
	System.out.println("The end of constructor chaining");
	}

}
