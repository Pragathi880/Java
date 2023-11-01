package com.xworkz.september.driver;
import com.xworkz.september.things.Dog;

public class AnimalRunner {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("puppy");
		dog.setFourLeg(true);
		dog.setColor("White");
		dog.setAge(4);
		
		String name = dog.getName();
		System.out.println("Name of the Dog:"+name);
        boolean legs = dog.isFourLeg();
        System.out.println("Is dog as four legs:"+legs);		
        int age = dog.getAge();
        System.out.println("Age of dog:"+age);
        String color = dog.getColor();
        System.out.println("Color of dog:"+color);
	}

}
