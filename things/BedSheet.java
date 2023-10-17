package com.xworkz.september.things;

public class BedSheet {
	public String colour;
	public int width;
	public int length;
	public boolean printed;
	public String shape;
	
	public BedSheet() {
		System.out.println("This is a constructor class name BedSheet");
	}
	
	public BedSheet(String colour,int width) {
		this.colour = colour;
		this.width = width;
		System.out.println("Colour:"+this.colour+"  "+"Width:"+this.width);
	}
	
	public BedSheet(String shape,boolean printed) {
		this.shape = shape;
		this.printed = printed;
		System.out.println("Shape:"+this.shape+"  "+"Printed or not:"+this.printed);
	}
	

}
