package com.xworkz.september.driver;

import com.xworkz.september.things.OnlineCustomer;

public class CustomerRunner {
		public static void main(String[] args) {
			
			OnlineCustomer o=new OnlineCustomer();
			o.nameOfCustomer=("PRAGATHI R");
			System.out.println("single level inheritance");
			System.out.println(o.nameOfCustomer);
			System.out.println(o.customerId);
			System.out.println(o.address);
		}

	}


