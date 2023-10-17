package com.xworkz.september.driver;

public class SortAscendingDescending {
	public static void main(String args[]) {
		int sort[]= {56,78,2,3,4,1,90,78,98,45,2};
		int temp=0;
		System.out.println("Original array sort:");
		
		
		for(int i=0;i<=sort.length-1;i++)
			System.out.println(sort[i]+" ");
		{
			for(int i=0;i<=sort.length;i++) {
				for(int j=i+1;j<=sort.length;j++) {
					if sort[i]<sort[j] {
						temp[]=sort[i];
						sort[i]=sort[j];
						sort[j]=temp[];
					}
				}
			}
			
					System.out.println("  ");
					 System.out.println("Elements of array sorted in descending order: ");  
				        for (int i = 0; i < arr.length; i++) {   
				            System.out.print(arr[i] + " ");  
				        } 
		
		}
}
	
			
			
			
			

	


