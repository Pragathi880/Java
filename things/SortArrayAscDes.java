package com.xworkz.september.things;

public class SortArrayAscDes {
	public static void main (String args[]){
		int []numArry=new int[]{12,34,73,82,4,3,1,8,9,80,26,54,65};
		int temp;
		for(int i=0;i<numArry.length;i++){
			for(int j=i;j<numArry.length;j++){
				if(numArry[i] < numArry[j]){
				 temp = numArry[i];
				 numArry[i] = numArry[j];
				 numArry[j] = temp;
				
				}
			}
		
		}
		for(int a : numArry){
			System.out.println(a);
	    }
	}
}
