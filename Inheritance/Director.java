package com.xworkz.september.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Director {
	private String nameOfDirector;
	private String nameOfMovieDirecting;
	private long budget;
	private int numOfPeopleInMovie;
	public Director(String nameOfDirector, String nameOfMovieDirecting, long budget, int numOfPeopleInMovie) {
		super();
		this.nameOfDirector = nameOfDirector;
		this.nameOfMovieDirecting = nameOfMovieDirecting;
		this.budget = budget;
		this.numOfPeopleInMovie = numOfPeopleInMovie;
	}

}
