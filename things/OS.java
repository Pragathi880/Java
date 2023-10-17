package com.xworkz.september.things;

public class OS {
	
	public static void getOsInformation() {
		System.out.println("To get the OS information:");
	}
	public static void getOsInformation(float osVersion,String nameOfOs) {
		System.out.println("To get the OS information:"+osVersion+"  "+nameOfOs );
		if(nameOfOs=="window") {
			System.out.println(" Nmae of the Os matched with window:");
		}
			else {
				System.out.println("Name of the Os is not matched with window:");
			}
		}
	
	public static float getVersion() {
		System.out.println("To get the Version:");
		return 10.0f;
	}

}
