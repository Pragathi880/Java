package com.xworkz.september.things;

public class ProductName {
	int index = 0;
	String []productList = new String[5];
	
	public void onSave(String ProductName) {
		System.out.println(ProductName);
		if(index<productList.length) {
			productList[index]=ProductName;
			index++;
		}else {
			System.out.println("List is full");
		}
	}
	
	public void getElements() {
		for(int i=0;i<productList.length;i++) {
			System.out.println(productList[i]);
		}
	}

}
