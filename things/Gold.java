package com.xworkz.september.things;

public class Gold {
	public String name;
	public int cost;
	public String weight;
	public int numOfGoldAccessories;
	public String colour;
	
	public Gold() {
		System.out.println("This is a Constructor of class name Gold");
	}
	
	public Gold(String name,int cost,String colour) {
		this.name = name;
		this.cost = cost;
		this.colour = colour;
		System.out.println("Name:"+this.name+"  "+"Cost of gold:"+this.cost+"  "+" Colour of gold:"+this.colour);
		
	}
	

}
