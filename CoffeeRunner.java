package com.xworkz.driver;
import com.xworkz.things.Coffee;
import com.xworkz.things.CoffeePowder;
import com.xworkz.things.Milk;
public class CoffeeRunner {
	public static void main(String []args) {
		Coffee coffee = new Coffee();
		Milk milk = new Milk();
		CoffeePowder coffeepowder = new CoffeePowder();
		
		milk.setMilktype("Nandini");
		milk.setPrice(84);
	    milk.setLiters(2);
		coffeepowder.setPowderType("BRU");
		coffeepowder.setQuantity(4);
		coffeepowder.setCost(60);
		
		coffee.setMilk(milk);
		coffee.setCoffeePowder(coffeepowder);
		System.out.println(coffee.getCoffeePowder().getPowderType());
		System.out.println(coffee.getMilk().getLiters());
		System.out.println(coffee.getMilk().getPrice());
		
		
	}
	
	

}
