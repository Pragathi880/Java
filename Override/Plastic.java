package com.xworkz.september.things;

public class Plastic extends Paper {
	public String plasticType;
	
	@Override
	public void getCraftName(String craftName) {
		System.out.println("To get the craft ready need plastic ");
	}
	
	public void getCraftType(String craftType) {
		System.out.println("To get the type of craft plastic is neded");
	}
	
	public void isGumNeeded(boolean gumNeeded) {
		System.out.println("Yes gum needed to do craft");
	}

}
