package com.xworkz.september.things;

public class Politician {
	public String name;
	public String position;
	public int yearOfElection;
	public int yearOfAppointement;
	
	public Politician() {
		System.out.println("This is a constructor class name Temple");
	}
	
	public Politician(String name,String position,int yearOfElection) {
		this.name = name;
		this.position = position;
		this.yearOfElection = yearOfElection;
		System.out.println("Name of Politician:"+this.name+"  "+"Position of Politician:"+this.position+"  "+"Year of Election Held:"+this.yearOfElection);
	}

}
