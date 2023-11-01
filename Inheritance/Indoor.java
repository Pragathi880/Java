package com.xworkz.september.things;

public class Indoor extends Sports{
	public Indoor() {
		super("Shuttle",4,"Shuttle Bat",1980);
		System.out.println("This is derived class constructor");
		System.out.println(super.getNameOfSports());
		System.out.println(super.getNumOfPlayers());
		System.out.println(super.getPropertiesNeeded());
		System.out.println(super.getYearOfEstablishment());
		System.out.println("The end of constructor chaining");
	}
}
