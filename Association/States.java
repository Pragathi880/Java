package com.xworkz.september.things;

public class States {
	private String nameOfStates;
	private String areaOfStates;
	private int numOfStates;
	private String language;
	private int population;
	
	public States() {
		System.out.println("no arguments");
	}
	public States(String nameOfStates, String areaOfStates, int numOfStates, String language, int population) {
		System.out.println("all arguments");
		this.nameOfStates = nameOfStates;
		this.areaOfStates = areaOfStates;
		this.numOfStates = numOfStates;
		this.language = language;
		this.population = population;
	}
	public String getNameOfStates() {
		return nameOfStates;
	}
	public void setNameOfStates(String nameOfStates) {
		this.nameOfStates = nameOfStates;
	}
	public String getAreaOfStates() {
		return areaOfStates;
	}
	public void setAreaOfStates(String areaOfStates) {
		this.areaOfStates = areaOfStates;
	}
	public int getNumOfStates() {
		return numOfStates;
	}
	public void setNumOfStates(int numOfStates) {
		this.numOfStates = numOfStates;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	
	
	
	

}
