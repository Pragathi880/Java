package com.xworkz.september.things;

public class ContactNumbers {
	int index = 0;
	long []ContactNumList = new long[3];
	
	public void onSave(long ContactNumbers) {
		System.out.println(ContactNumbers);
		if(index<ContactNumList.length) {
			ContactNumList[index]=ContactNumbers;
			index++;
		}else {
			System.out.println("The contact list is fuull......");
		}
	}
	
	public void getElements() {
		for(int i=0;i<ContactNumList.length;i++) {
			System.out.println(ContactNumList[i]);
		}
	}

}
