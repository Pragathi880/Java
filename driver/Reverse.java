package com.xworkz.september.driver;

public class Reverse {
	public static void main(String args[]) {
		int array[] = {1,2,3,4,5,6};
		System.out.println("Array before reversing");
		for(int i=0; i<=array.length-1;i++) {
			
			System.out.print(array[i]+ " ");
		}
		System.out.println("");
		System.out.println("Array after reversing");
		for(int i = array.length-1;i>=0;i--) {
			
			System.out.print( array[i]+ " ");
		}
		
	}

}
