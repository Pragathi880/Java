package com.xworkz.september.things;

public class Bags {
	public String name;
	public String colour;
	public String brand;
	public int cost;
	public boolean bagAvailable;
	
	public Bags() {
		System.out.println("This is Constructor of class name Bags");
	}
	
	public Bags(String name,String colour) {
		this.name = name;
		this.colour = colour;
		System.out.println("Name of bag:" +this.name+ "  "+this.colour);
	}
	public Bags(int cost,boolean bagAvailable) {
		this.cost = cost;
		this.bagAvailable = bagAvailable;
		System.out.println("Price of bag:"+this.cost+ "  "+this.bagAvailable);
	}

}
