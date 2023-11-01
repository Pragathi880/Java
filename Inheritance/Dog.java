package com.xworkz.september.things;

public class Dog extends Animal{
	public Dog() {
		super("Puppy",true,4,"White");
		System.out.println("This is derived class constructor");
		System.out.println(super.getName());
		System.out.println(super.isFourLeg());
		System.out.println(super.getAge());
		System.out.println(super.getColor());
		System.out.println("The end of constructor chaining");
	}
	
           
		
	}


