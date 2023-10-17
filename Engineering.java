package com.xworkz.september.things;

public class Engineering {
	int index = 0;
	String []branchName = new String[5];
	
	 public void onSave(String nameOfBranch ) {
	    	System.out.println("To print the name of Branch");
	    	if(index<branchName.length) {
	    		branchName[index]=nameOfBranch;
	    		index++;
	    	}else {
	    		System.out.println("Not Exists" );
	    	}
	    }
	 
	 public void getElement() {
		 System.out.println("To Read the elements");
		 for(int i =0;i<branchName.length;i++) {
			 if(branch Name[i] = null){
			System.out.println(branchName[i]);
			 }
		 }
	 }
	 
	 public void update(String oldElement , String newElement) {
		 int update = 0;
		 for(int i=0;i<branchName.length;i++) {
			 if(branchName[i]==oldElement) {
				 branchName[i] = newElement;
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
		 for(int i=0;i<branchName.length;i++) {
			 if(branchName[i]==element) {
				 branchName[i] = null;
			 }if(i==(branchName.length-1)&&(branchName[i])!= element){
    	    	 System.out.println(" Element not exists");
		 }
	 }
	 }
}


