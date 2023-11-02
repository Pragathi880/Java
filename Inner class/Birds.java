package com.xworkz.september.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Birds {
	public String nameOfBird;
	public int numOfBirds;
	public Birds() {
		System.out.println("This is No-args constructor");
	}
	
	public Birds(String nameOfBird, int numOfBirds) {
		super();
		System.out.println("This is  All-args constructor");
		this.nameOfBird = nameOfBird;
		this.numOfBirds = numOfBirds;
		
	}


	public class Parrot extends Birds{
		public String placeOfLiving;
		public int numOfLegs;
		public boolean haveWings;
		public String color;
		
		public Parrot() {
			System.out.println("This is No-args constructor");
		}
		public Parrot(String placeOfLiving, int numOfLegs, boolean haveWings, String color) {
			super("Parrot",30);
			System.out.println("This is  All-args constructor");
			this.placeOfLiving = placeOfLiving;
			this.numOfLegs = numOfLegs;
			this.haveWings = haveWings;
			this.color = color;
			System.out.println("This is derived class constructor");
			System.out.println(super.getNameOfBird());
			System.out.println(super.getNumOfBirds());
			System.out.println("................................................");
			
		}
		
	}

}
