package com.xworkz.september.things;

public class Chairs {
	public String colour;
	public int numOfChairs;
	public String shape;
	public char chairPresent;
	public boolean personSitingOnIt;
	
	public Chairs(){
		System.out.println("This is a Constructor of class name Chairs");
	}
	
	public Chairs(String colour,int numOfChairs) {
		this.colour = colour;
		this.numOfChairs = numOfChairs;
		System.out.println("Colour:"+this.colour+"  "+" Number Of Chairs:"+this. numOfChairs);
		
	}
	
	public Chairs(String shape,char chairPresent,boolean personSitingOnIt) {
		this.shape = shape;
		this.chairPresent = chairPresent;
		this.personSitingOnIt =  personSitingOnIt;
		System.out.println("Shape:"+this.shape+"  "+" If Chairs present or not:"+chairPresent+"  "+"Is person Sitting on chair:"+this.personSitingOnIt);
		
	}
}
