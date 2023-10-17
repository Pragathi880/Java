package com.xworkz.september.things;

public class Television {
	public String name;
	public int price;
	public String tVNumber;
	public int numOfChannelsAvailable;
	public int numOfLanguages;
	
	public Television() {
		System.out.println("This is a constructor class name Television");
	}
	
	public Television(String name,int price,String tVNumber,int numOfLanguages) {
		this.name = name;
		this.price = price;
		this.tVNumber = tVNumber;
		this.numOfLanguages = numOfLanguages;
		
		System.out.println("Name of Television:"+this.name+"  "+"Cost of Television:"+this.price+"  "+"Tv Number:"+this.tVNumber+" "+"Number of Languages in Television:"+this.numOfLanguages);
	}

}
