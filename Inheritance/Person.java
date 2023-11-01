package com.xworkz.september.things;

public class Person extends Dancer {
	public Person() {
		super("Pragathi",10,"Contemporary","Banglore");
		System.out.println("This is derived class constructor");
		System.out.println(super.getNameOfDancer());
		System.out.println(super.getNumOfDancers());
		System.out.println(super.getTypeOfDance());
		System.out.println(super.getPlace());
		System.out.println("The end of constructor chaining");
	}
}
