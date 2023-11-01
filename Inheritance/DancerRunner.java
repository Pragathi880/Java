package com.xworkz.september.driver;

import com.xworkz.september.things.Person;

public class DancerRunner {
	public static void main(String[] args) {
		Person person = new Person();
		person.setNameOfDancer("Prgathi");
		person.setNumOfDancers(10);
		person.setTypeOfDance("Contemporary");
		person.setPlace("Banglore");
		
		String name = person.getNameOfDancer();
		System.out.println("Name of the dancer:"+name);
		int num = person.getNumOfDancers();
		System.out.println("Numbers of dancers:"+num);
		String type = person.getTypeOfDance();
		System.out.println("Type of Dance:"+type);
		String place = person.getPlace();
		System.out.println("Place of the dancer:"+place);
	}

}
