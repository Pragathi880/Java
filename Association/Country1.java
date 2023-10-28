package com.xworkz.september.things;

public class Country1 {
	private States states;
	
	public Country1() {
		System.out.println("no arguments");
	}
	
	public Country1(States states) {
		System.out.println("all argument constructor");
		this.states=states;
	}

	public States getStates() {
		return states;
	}

	public void setStates(States states) {
		this.states = states;
	}
	
	

}
