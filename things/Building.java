package com.xworkz.september.things;

public class Building {
	public String name;
	public int buildNumber;
	public String buildArea;
	public int buildFloor;
	public float buildRate;
	
	public Building() {
		System.out.println("This is a Constructor of class name Building");
	}
	
	public Building(String name,int buildNumber,float buildRate) {
		this.name = name;
		this.buildNumber = buildNumber;
		this.buildRate = buildRate;
		System.out.println("Name of building:"+this.name+"  "+"Building number:"+this.buildNumber+" "+"Building area:"+"  "+this.buildRate);
	}

}
