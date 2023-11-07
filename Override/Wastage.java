package com.xworkz.september.things;

public class Wastage extends Plastic{
	public String typeOfMaterial;
	
	@Override
	public void getCraftName(String craftName) {
		System.out.println("To get the name of craft needplastic and cloths");
	}
	
	public void getCraftType(String typeOfMaterial) {
		System.out.println("To get the type of craft materials is needed to prepare");
	}
	
	public void isGumNeeded(boolean gumNeeded) {
		System.out.println("Yes gum needed to do craft");
	}

}
