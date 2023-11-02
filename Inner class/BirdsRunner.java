package com.xworkz.september.driver;

import com.xworkz.september.things.Birds;
import com.xworkz.september.things.Birds.Parrot;

public class BirdsRunner {
	public static void main(String[] args) {
		Birds birds = new Birds();
		birds.nameOfBird = " Parrot";
		birds.numOfBirds = 30;
		System.out.println("This is bird class properties:");
		System.out.println("Name of the bird: "+birds.nameOfBird);
		System.out.println("Number of birds in forest: "+birds.numOfBirds);
		System.out.println("Bird class properties ends");
		
		Parrot parrot = birds.new Parrot();
		parrot.placeOfLiving = "Forest";
		parrot.numOfLegs = 2;
		parrot.haveWings = true;
		parrot.color = "Green";
		//getter and setter
		parrot.setNameOfBird("Parrot");
		parrot.setNumOfBirds(30);
		System.out.println(parrot.getNameOfBird());
		System.out.println(parrot.getNumOfBirds());
		
		System.out.println("This is inner class parrot properties:");
		System.out.println("Place where the parrot leaves: "+parrot.placeOfLiving);
		System.out.println("Number of legs in parrot: "+parrot.numOfLegs);
		System.out.println("Is parrot have wings to fly: "+parrot.haveWings);
		System.out.println("Color of parrot: "+parrot.color);
		System.out.println("Parrot class properties ends");
	}

}
