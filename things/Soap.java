package com.xworkz.september.things;

public class Soap {
	public String name;
	public String typeOfSoap;
	public String colour;
	public int cost;
	public String weight;
	
	public Soap() {
		System.out.println("This is a Constructor of class name Soap");
	}
	
	public Soap(String name,String typeOfSoap,String weight) {
		this.name = name;
		this.typeOfSoap = typeOfSoap;
		this.weight = weight;
		System.out.println("Name of Soap:"+this.name+"  "+"Type of Soap:"+this.typeOfSoap+"  "+"Weight of Soap:"+this.weight);
	}
	
	public Soap(String colour,int cost) {
		this.colour = colour;
		this.cost = cost;
		System.out.println("Colour of Soap:"+this.colour+"  "+"Cost of Soap:"+this.cost);
	}

}
