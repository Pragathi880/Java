package com.xworkz.september.driver;

public class sumArrayElements {
	public static void main(String args[]) {
		int array[] = {25,34,35,39,29,92,84,63,27,92};
		int sum=0;
		for(int i=0;i<=array.length-1;i++)
			sum = sum+array[i];
		System.out.println("Sum of all elements in array:"+sum);

	}

}
