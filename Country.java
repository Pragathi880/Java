package com.xworkz.september.things;

public class Country {
	int index = 0;
		String []countryName = new String[3];
		
		 public void onSave(String nameOfCountry ) {
		    	System.out.println("To print the name of Country");
		    	if(index<countryName.length) {
		    		countryName[index]=nameOfCountry;
		    		index++;
		    	}else {
		    		System.out.println("Not Exists..." );
		    	}
		    }
		 
		 public void getElement() {
			 System.out.println("To Read the elements.........");
			 for(int i =0;i<countryName.length;i++) {
				 if(countryName[i] = null){
				System.out.println(countryName[i]); 
				 }
			 }
		 }
		 
		 public void update(String oldElement , String newElement) {
			 int update = 0;
			 for(int i=0;i<countryName.length;i++) {
				 if(countryName[i]==oldElement) {
					 countryName[i] = newElement;
					 update++;
				 }
			 }
			 if(update!=0) {
				 System.out.println("Update done successfully");
			 }else {
				 System.out.println("not done");
			 }
		 }
		 
		 public void delete(String element) {
			 for(int i=0;i<countryName.length;i++) {
				 if(countryName[i]==element) {
					 countryName[i] = null;
				 }if(i==(countryName.length-1)&&(countryName[i])!= element){
	    	    	 System.out.println("not exists....");
			 }
		 }
		 }
}
