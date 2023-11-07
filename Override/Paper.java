package com.xworkz.september.things;

public class Paper extends Craft{
	public String paperType;
	public String paperColor;
	public int numOfPaper;
	
	@Override
	public void getCraftName(String craftName) {
		System.out.println("To get the name of craft is paper craft need A4 sheet");
	}
	
	public void getCraftType(String craftType) {
		System.out.println("To get the type of craft is origami");
	}
	
	public void isGumNeeded(boolean gumNeeded) {
		System.out.println("yes gum needed to do craft");
	}

}
