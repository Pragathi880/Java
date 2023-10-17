package com.xworkz.september.driver;
import com.xworkz.september.things.SoftwareName;
public class SoftwareNameRunner {
	public static void main(String args[]) {
		SoftwareName software = new SoftwareName();
		software.onSave("Microsoft");
		software.onSave("Adobe");
		software.onSave("Linux");
		software.onSave("Windows");
		software.onSave("FireFox");
		software.onSave("SpreadSheet");
		software.getElements();
	}

}
