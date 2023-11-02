package com.xworkz.september.driver;

import com.xworkz.september.things.Drawing;

public class PaintingRunner {
	public static void main(String[] args) {
		Drawing drawing = new Drawing();
		drawing.setTypeOfPainting("Wall Painting");
		drawing.setNameOfPainter("Pragathi R");
		drawing.setPaintingCompleted(true);
		drawing.setNumOfColorsUsed(25);
		
		String type = drawing.getTypeOfPainting();
		System.out.println("Type of painting:"+type);
		String name = drawing.getNameOfPainter();
		System.out.println("Name of the painter:"+name);
		boolean completed = drawing.isPaintingCompleted();
		System.out.println("Is painting completed:"+completed);
		int color = drawing.getNumOfColorsUsed();
		System.out.println("Number of colors used:"+color);
	}

}
