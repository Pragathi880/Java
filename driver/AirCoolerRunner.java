package com.xworkz.september.driver;
import com.xworkz.september.things.AirCooler;
public class AirCoolerRunner {
	public static void main(String args[]) {
		AirCooler ac=new AirCooler();
		ac.price=5000;
		ac.brand="";
		ac.speed=0;
		ac.temperature="";
		ac.implNumber="";
	    Price = ac.price*10/100;
		
		System.out.println(ac.price);
		System.out.println(ac.brand);
		System.out.println(ac.speed);
		System.out.println(ac.temperature);
		System.out.println(ac.implNumber);
		
		System.out.println(":");
		
		if(ac.price==10000) {
			System.out.println("Temperature is:" +ac.temperature);
		}
		
		System.out.println(":");
		
		if(ac.price>=1000 && ac.price<=2000) {
			System.out.println("Details of AirCooler:");
			System.out.println("Price:" +ac.price);
			System.out.println("Brand:" +ac.brand);
			System.out.println("Speed:" +ac.speed);
			System.out.println("Temperature:" +ac.temperature);
			System.out.println("IMPL Number:" +ac.implNumber);
			
			System.out.println(":");
			
		if(ac.price==5000) {
			
		}
		}
		
		
	}

}
