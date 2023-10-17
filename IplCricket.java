package com.xworkz.september.things;

public class IplCricket {
	int index = 0;
	String []teamName = new String[8];
	
	 public void onSave(String nameOfCricketName ) {
	    	System.out.println("To print the name of the Crickrt team names....");
	    	if(index<teamName.length) {
	    		teamName[index]=nameOfCricketName;
	    		index++;
	    	}else {
	    		System.out.println("Not Exists" );
	    	}
	    }
	 
	 public void getElement() {
		 System.out.println("To Read the elements");
		 for(int i =0;i<teamName.length;i++) {
			System.out.println(teamName[i]); 
		 }
	 }
	 
	 public void update(String oldElement , String newElement) {
		 int update = 0;
		 for(int i=0;i<teamName.length;i++) {
			 if(teamName[i]==oldElement) {
				 teamName[i] = newElement;
				 update++;
			 }
		 }
		 if(update!=0) {
			 System.out.println("Update done successfully!!!!!!!!");
		 }else {
			 System.out.println("not done!!");
		 }
	 }
	 
	 public void delete(String element) {
		 for(int i=0;i<teamName.length;i++) {
			 if(teamName[i]==element) {
				 teamName[i] = null;
			 }if(i==(teamName.length-1)&&(teamName[i])!= element){
    	    	 System.out.println(" Element not exists");
		 }
	 }
	 }

}
