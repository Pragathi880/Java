package com.xworkz.things;

public class Coffee {
	private Milk milk;
	private CoffeePowder coffeePowder;
	
	public Coffee() {
		System.out.println("no argument constructor");
	}
	public Coffee(Milk milk, CoffeePowder coffeePowder) {
		this.milk = milk;
		this.coffeePowder = coffeePowder;
	}
	public Milk getMilk() {
		return milk;
	}
	public void setMilk(Milk milk) {
		this.milk = milk;
	}
	public CoffeePowder getCoffeePowder() {
		return coffeePowder;
	}
	public void setCoffeePowder(CoffeePowder coffeePowder) {
		this.coffeePowder = coffeePowder;
	}
	
	
	

}
