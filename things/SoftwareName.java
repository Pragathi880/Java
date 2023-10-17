package com.xworkz.september.things;

public class SoftwareName {
	int index = 0;
	String []SoftwareList = new String[4];
	
	public void onSave(String SoftwareName) {
		System.out.println(SoftwareName);
		if(index<SoftwareList.length) {
			SoftwareList[index] = SoftwareName;
			index++;
		}else {
			System.out.println("The list is full.........");
		}
	}
	
	public void getElements() {
		for(int i=0;i<SoftwareList.length;i++) {
			System.out.println(SoftwareList[i]);
		}
	}

}
