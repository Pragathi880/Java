package com.xworkz.september.things;


import lombok.Getter;

import lombok.Setter;

@Getter
@Setter


public class Animal {
	private String name;
	private boolean fourLeg;
	private int age;
	private String color;
	public Animal(String name, boolean fourLeg, int age, String color) {
		super();
		this.name = name;
		this.fourLeg = fourLeg;
		this.age = age;
		this.color = color;
	}
	
	
	
	

}
