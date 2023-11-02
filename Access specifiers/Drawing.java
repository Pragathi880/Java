package com.xworkz.september.things;


public class Drawing extends Painting{
	public Drawing() {
		super("Wall painting",25,"pragathi R",true);
		System.out.println("This is derived constructor");
		System.out.println(super.getTypeOfPainting());
		System.out.println(super.getNumOfColorsUsed());
		System.out.println(super.getNameOfPainter());
		System.out.println(super.isPaintingCompleted());
		System.out.println("Derived class ends");
	}

}
