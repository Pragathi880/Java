package com.xworkz.september.driver;

import com.xworkz.september.things.Movie;

public class DirectorRunner {
	public static void main(String[] args) {
		Movie movie = new Movie();
		movie.setNameOfDirector("G Aravindan");
		movie.setNameOfMovieDirecting("Kanchana Sita");
		movie.setBudget(100000000);
		movie.setNumOfPeopleInMovie(30);
		
		String name = movie.getNameOfDirector();
		System.out.println("Name of the director:"+name);
		String nameMovie = movie.getNameOfMovieDirecting();
		System.out.println("Name of movie:"+nameMovie);
	    long money = movie.getBudget();
	    System.out.println("Money:"+money);
		int people = movie.getNumOfPeopleInMovie();
		System.out.println("Number of people in movie:"+people);
	}

}
