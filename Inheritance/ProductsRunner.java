package com.xworkz.september.driver;
import com.xworkz.september.things.ECommers;

public class ProductsRunner {
	public static void main(String[] args) {
		ECommers ecommers = new ECommers();
		ecommers.setName("Cloths");
		ecommers.setQuantity("10kg");
		ecommers.setProcuctDelivered(true);
		ecommers.setRating(4f);
		
		String name = ecommers.getName();
		System.out.println("Name of product"+name);
		String quantity = ecommers.getQuantity();
		System.out.println("Quanty of that product"+quantity);
		boolean delivered = ecommers.isProcuctDelivered();
		System.out.println("Is product delivered:"+delivered);
		float rating = ecommers.getRating();
		System.out.println("Rating given to product:"+rating);
		}
		

}
