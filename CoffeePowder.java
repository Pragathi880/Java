package com.xworkz.things;

public class CoffeePowder {
	private String powderType;
	private int cost;
	private float quantity;
	
	public CoffeePowder() {
		System.out.println("This is no argument constructor");
	}
	public CoffeePowder(String powderType, int cost, float quantity) {
		this.powderType = powderType;
		this.cost = cost;
		this.quantity = quantity;
	}
	public String getPowderType() {
		return powderType;
	}
	public void setPowderType(String powderType) {
		this.powderType = powderType;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public float getQuantity() {
		return quantity;
	}
	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	
	

}
