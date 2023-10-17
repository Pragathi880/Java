package com.xworkz.september.driver;

public class evenNumberInArray {
	public static void main(String args[]) {
		int array[] = {1, 26, 93, 24, 35, 36, 87, 88, 49};
		int countEven=0, countOdd=0;
		for( int i=0;i<=array.length-1;i++) {
			if((array[i] % 2)==0)
			    countEven +=1;
			else
				countOdd +=1;
		

		}
		System.out.println("The number of even numbers:"+countEven);
		System.out.println("The number of odd numbers:"+countOdd);	

	}

}