package com.xworkz.september.things;

public class ECommers extends Products{
	public ECommers() {
		super("Cloths","10kg",true, 8.6f);
		System.out.println("This is derived class constructor");
		System.out.println(super.getName());
		System.out.println(super.getQuantity());
		System.out.println(super.isProcuctDelivered());
		System.out.println(super.getRating());
		System.out.println("The end of constructor chaining");
	}
}
