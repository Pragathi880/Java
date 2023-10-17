package com.xworkz.september.things;

public class Games {
    int index = 0;
    String []gameName = new String[6];
    
    public void onSave(String nameOfGame ) {
    	System.out.println("To print the name of games");
    	if(index<gameName.length) {
    		gameName[index]=nameOfGame;
    		index++;
    	}else {
    		System.out.println("Not Exists..." );
    	}
    }
    
    public void getElement() {
    	System.out.println("READ THE ELEMENTS......");
    	for(int i=0;i<gameName.length;i++) {
    		System.out.println(gameName[i]);
    	}
    }
    
    public void update(String oldElement,String newElement) {
    	System.out.println("UPDATION...........");
    	for(int i=0;i<gameName.length;i++) {
    		if(gameName[i] == oldElement) {
    		gameName[i] = newElement;
    	}/*else {
    		System.out.println("Element not exists.......");
    		break;
    	}*/
    }
    
    } 
    
       public void delete(String element) {
    	System.out.println("DELETING.................");
    	for(int i=0;i<gameName.length;i++) {
    		if(gameName[i] == element) {
    			gameName[i] = null;
    		}
    	     if(i==(gameName.length-1)&&(gameName[i])!= element){
    	    	 System.out.println("not exists....");
    	     }
    	}
    }
    
}
