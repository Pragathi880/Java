package com.xworkz.september.things;

public class Channel1 extends Television1 {
	public String nameOfChannel;
	public int channelNumber;
	
	@Override
	public void getNameOfTelevision(String name) {
		System.out.println("The name of Television is Samsung");
	}
	
	public void getCostOfTelevision(int price) {
		System.out.println("The cost of Television is 40 Thousand");
	}
	
	public void getNumOfLanguages(int numOfLanguages) {
		System.out.println("The number of Languages Available in Samgung Television is 100");
	}

}
