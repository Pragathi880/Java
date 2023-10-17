package com.xworkz.september.driver;
import com.xworkz.september.things.TraineeName;
public class TraineeNameRunner {
	public static void main(String args[]) {
		TraineeName traineeName = new TraineeName();
		traineeName.onSave("Pragathi");
		traineeName.onSave("Nidhi");
		traineeName.onSave("Ramya");
		traineeName.onSave("Divya");
		traineeName.onSave("Rakshitha");
		traineeName.onSave("Vennela");
		traineeName.onSave("Varsha");
		traineeName.getElements();
		
	}
}
