package com.xworkz.september.things;

public class Movie extends Director{
	public Movie() {
		super("G Aravindan","Kanchana Sita",1000000000,30);
		System.out.println("This is derived class constructor");
		System.out.println(super.getNameOfDirector());
		System.out.println(super.getNameOfMovieDirecting());
		System.out.println(super.getBudget());
		System.out.println(super.getNumOfPeopleInMovie());
		System.out.println("The end of constructor chaining");
	}
}
