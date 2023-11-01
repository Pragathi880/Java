package com.xworkz.september.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Dancer {
	private String nameOfDancer;
	private int numOfDancers;
	private String typeOfDance;
	private String place;
	public Dancer(String nameOfDancer, int numOfDancers, String typeOfDance, String place) {
		super();
		this.nameOfDancer = nameOfDancer;
		this.numOfDancers = numOfDancers;
		this.typeOfDance = typeOfDance;
		this.place = place;
	}

}
