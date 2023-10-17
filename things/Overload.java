package com.xworkz.september.things;

public class Overload {
	public static void main(String args[]) {
		int i = 20;
		Overload.cars(20);
		Overload.carName("  ");
		System.out.println(i);
	}

	public static int cars(int price) {
		System.out.println(price);
		return 50;
	}

	public static void carName(String name) {
		System.out.println(name);
	}

}
