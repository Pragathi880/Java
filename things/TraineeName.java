package com.xworkz.september.things;

public class TraineeName {
	int index = 0;
	String []trainersList = new String[5];
	
	public void onSave(String TraineeName) {
		System.out.println(TraineeName);
		if(index<trainersList.length) {
			trainersList[index]=TraineeName;
			index++;
		}else {
			System.out.println("The List is full");
		}
	}
	
	public void getElements() {
		for(int i=0;i<trainersList.length;i++) {
			System.out.println(trainersList[i]);
		}


	}
}