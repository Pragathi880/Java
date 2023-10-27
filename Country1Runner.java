package com.xworkz.september.driver;
import com.xworkz.september.things.States;

import com.xworkz.september.things.Country1;

public class Country1Runner {
	public static void main(String args[]) {
		Country1 country = new Country1();
		States states = new States();
		
		states.setNameOfStates("Karnataka");
	    states.setNumOfStates(29);
	    states.setPopulation(452);
	    states.setLanguage("Kannada");
	    states.setAreaOfStates("123sq.ft");
	    
	    country.setStates(states);
	    System.out.println(country.getStates().getNameOfStates());
	    System.out.println(country.getStates().getNumOfStates());
	    System.out.println(country.getStates().getPopulation());
	    System.out.println(country.getStates().getLanguage());
	    System.out.println(country.getStates().getAreaOfStates());
		
	}

}