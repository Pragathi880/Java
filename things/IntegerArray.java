package com.xworkz.september.things;

public class IntegerArray {
	public static String[] getNames() {
		String name[] = {"Pragathi", "Nidhi","Ramya","Vanitha","Divya"};
		for(int i=0;i<=name.length-1;i++) {
			System.out.println("Name:" +name[i]);
		}
		return name;
	}
	public static float[] getDecimal() {
		float decimal[] = {0.4f,9.3f,83.4f,73.8f};
		for(int i=0;i<decimal.length;i++) {
			System.out.println("Decimal:" +decimal[i]);
		}
		return decimal;
		}
	public static boolean[] getBoolean() {
		boolean num[] = {true,false,false,true,true,};
		for(int i=0;i<num.length;i++) {
			System.out.println("Num:" +num[i]);
		}
		return num;
	}
	public static char[] getCharacter() {
		char number[] = {'2','g','p','8'};
		for(int i=0;i<number.length;i++) {
		   System.out.println("Number:" +number[i]);
		}
		return number;
	}
	public static int[] getInteger() {
		int numbers[] = {1,6,3,95,03,37,6,22,47,83};
		for(int i=0;i<numbers.length;i++) {
			System.out.println("Integer Numbers:" +numbers[i]);
		}
		return numbers;
		}

	}


