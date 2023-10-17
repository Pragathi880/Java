package com.xworkz.september.things;

public class Temple {
	public String name;
	public String place;
	public String godName;
	public String timeOfOpenAndClose;
	public String poojaTime;
	
	public Temple() {
	    System.out.println("This is a constructor class name Temple");
	}
	
	public Temple(String name,String place,String godName) {
		this.name = name;
	    this.place = place;
	    this.godName = godName;
	    System.out.println("Name of temple:"+this.name+"  "+"Temple is located at:"+"  "+"Name of the god:"+this.godName);
	}

}
