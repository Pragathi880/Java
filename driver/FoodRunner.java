package com.xworkz.september.driver;

import com.xworkz.september.things.Food;

public class FoodRunner {
	public static void main(String []args) {
		System.out.println("Method without return type and without arguments");
		Food.homeMadeFood();
		Food.junkFood();
		Food.nameOfFood();
		Food.typeOfFood();
		
		System .out.println("Methods without return type with arguments");
		Food.nameOfFood("Dosa");
		Food.numOfFoods(30);
		Food.starterFood("soop");
		Food.foodAvailable(true);
		
		System .out.println("Methods with return type without arguments");
		Food.itemsInMenu();
		System.out.println("Items in menue:"+ Food.itemsInMenu());
		Food.nameOfTheFood();
		System.out.println("Name of the food:" + Food.nameOfTheFood());
		Food.totalBill();
		System.out.println("Total bill is:" + Food.totalBill());
		Food.foodServed();
		System.out.println("Is the food served:" + Food.foodServed());
		
		System .out.println("Methods with return type with arguments");
		Food.itemInMenu(65);
		System.out.println("Total number of items in menu:"+Food.itemInMenu(65));
		Food.namesOfFood("Gobi Manchuri");
		System.out.println("Total number of items in menu:"+Food.namesOfFood("Gobi Manchuri"));
		Food.isFoodServed(true);
		System.out.println("Is the food served:"+Food.isFoodServed(true));
		Food.totalBillOfFood(4000);
		System.out.println("Total bill of food:"+Food.totalBillOfFood(4000));
		
		
	}

}
