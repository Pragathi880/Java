package com.xworkz.september.driver;

import com.xworkz.september.things.Mistake;

public class MistakeRunner {
	public static void main(String args[]) {
		Mistake.getMistakeInformation(25);
		Mistake.numOfMistakes(15);
	System.out.println(" Number of mistake it return"+Mistake.numOfMistakes(87));
	}
}