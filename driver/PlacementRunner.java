package com.xworkz.september.driver;

import com.xworkz.september.things.Placement;

public class PlacementRunner {
	public static void main(String args[]) {
		Placement.rounds();
		Placement.rounds(4);
		Placement.rounds(3, "Technical");
		Placement.rounds(3, "HR Round", "Pragathi");
		Placement.rounds("Aptitude", 2, "Rahul");
	}

}
