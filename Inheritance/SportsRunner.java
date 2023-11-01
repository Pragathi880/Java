package com.xworkz.september.driver;

import com.xworkz.september.things.Indoor;

public class SportsRunner {
	public static void main(String[] args) {
		Indoor indoor = new Indoor();
		indoor.setNameOfSports("Shuttle");
		indoor.setNumOfPlayers(4);
		indoor.setPropertiesNeeded("Shuttle bat");
		indoor.setYearOfEstablishment(1980);
		
		String name = indoor.getNameOfSports();
		System.out.println("Name of the sports:"+name);
		int players = indoor.getNumOfPlayers();
		System.out.println("Number of players:"+players);
		String properties = indoor.getPropertiesNeeded();
		System.out.println("Properties need to play the indoor game:"+properties);
		int year = indoor.getYearOfEstablishment();
		System.out.println("Year of establishment:"+year);
	}

}
