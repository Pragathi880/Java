package com.xworkz.september.things;

public class Sand extends Painting1 {
	public String nameOfSand;
	
	@Override
	public void getColor(String color) {
		System.out.println("Colour of art is Blue");
	}
	
	public void getTypeOfArt(String typeOfArt) {
		System.out.println("Type of art used is Sand painting");
	}
	
	public void getNumOfTypes(int numOfTypes) {
		System.out.println("Num of types is 3 ");
	}

}
