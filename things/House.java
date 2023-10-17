package com.xworkz.september.things;

public class House {
	public String name;
	public int numOfMembers;
	public int numOfRooms;
	public int floors;
	public boolean isHouseHasGarden;
	
	public House() {
		System.out.println("This is a Constructor of class name House");
	}
	
	public House(String name,int numOfMembers,int numOfRooms,int floors,boolean isHouseHasGarden) {
		this.name = name;
		this.numOfMembers = numOfMembers;
		this.numOfRooms = numOfRooms;
		this.floors = floors;
		this.isHouseHasGarden = isHouseHasGarden;
		System.out.println("Name:"+this.name+"  "+"Number of mambers:"+this.numOfMembers+"  "+"Number of Numbers:"+this.numOfRooms+"  "+"Number of floors:"+this.floors+"  "+"If this has Garden:"+this.isHouseHasGarden);
		
	}

}
