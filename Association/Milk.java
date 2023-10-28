package com.xworkz.things;

public class Milk {
	private String milktype;
	private int liters;
	private float price;
	
	public Milk() {
		System.out.println("This is no argument constructor");
	}
	
	public Milk(String milkType , int liters , float price) {
			System.out.println("This is all arguments constructor");
            this.milktype = milkType;
            this.price = price;
            this.liters = liters;
	}

	public String getMilktype() {
		return milktype;
	}

	public void setMilktype(String milktype) {
		this.milktype = milktype;
	}

	public int getLiters() {
		return liters;
	}

	public void setLiters(int liters) {
		this.liters = liters;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
		

