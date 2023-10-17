package com.xworkz.september.things;

public class Bottle {
	public String name;
	public int numOfBootle;
	public String shape;
	public String colour;
	public boolean isWaterInBottle;
	
	public Bottle(){
		System.out.println("This is a Constructor of class name Bottle");
	}
	
	public Bottle(String name,int numOfBottle) {
		this.name = name;
		this.numOfBootle = numOfBottle;
		System.out.println("Name:"+this.name+"  "+"Number of bottle"+this.numOfBootle);
	}

}
