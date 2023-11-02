package com.xworkz.september.things;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Painting {
	String typeOfPainting;
	private int numOfColorsUsed;
	protected String nameOfPainter;
	public boolean isPaintingCompleted;
	public Painting() {
		System.out.println("No-args constructor");
	}
	public Painting(String typeOfPainting, int numOfColorsUsed, String nameOfPainter, boolean isPaintingCompleted) {
		super();
		System.out.println("All-args constructor");
		this.typeOfPainting = typeOfPainting;
		this.numOfColorsUsed = numOfColorsUsed;
		this.nameOfPainter = nameOfPainter;
		this.isPaintingCompleted = isPaintingCompleted;
	}
	

}
