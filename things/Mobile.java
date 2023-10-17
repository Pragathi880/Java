package com.xworkz.september.things;

public class Mobile {
	public String nameOfMobile;
	public int numOfMobiles;
	public boolean numOfMobilesSaled;
	public String version;
	public float cost;
	
	public Mobile() {
		System.out.println("This is a Constructor of class name Mobile");
	}
	
	public Mobile(String name,int number,boolean numOfMobilesSaled ) {
		nameOfMobile = name;
		numOfMobiles = number;
		this.numOfMobilesSaled = numOfMobilesSaled ;
		
		System.out.println("Name of mobile:"+name+"  "+"Number of Mobiles:"+number+"  "+"Is Mobiles are Saled:"+this.numOfMobilesSaled);
	}

}
