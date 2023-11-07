package com.xworkz.september.things;

public class Painting1 extends Art{
	public String typeOfPainting;
	public int numOfColourUsed;
	
	@Override
	public void getColor(String color) {
		System.out.println("Colour of art is Red");
	}
	
	public void getTypeOfArt(String typeOfArt) {
		System.out.println("Type of art used is Rongali");
	}
	
	public void getNumOfTypes(int numOfTypes) {
		System.out.println("Num of types is 2 ");
	}

}
