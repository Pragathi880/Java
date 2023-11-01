package com.xworkz.september.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Sports {
	private String nameOfSports;
	private int numOfPlayers;
	private String propertiesNeeded;
	private int yearOfEstablishment;
	public Sports(String nameOfSports, int numOfPlayers, String propertiesNeeded, int yearOfEstablishment) {
		super();
		this.nameOfSports = nameOfSports;
		this.numOfPlayers = numOfPlayers;
		this.propertiesNeeded = propertiesNeeded;
		this.yearOfEstablishment = yearOfEstablishment;
	} 

}
