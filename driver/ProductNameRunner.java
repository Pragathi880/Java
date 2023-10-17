package com.xworkz.september.driver;

import com.xworkz.september.things.ProductName;

public class ProductNameRunner {
	public static void main(String args[]) {
		ProductName productName = new ProductName();
		productName.onSave("Suvnik");
		productName.onSave("Rose32");
		productName.onSave("hafy635");
		productName.onSave("jdbdj");
		productName.onSave("ojsbsh");
		productName.onSave("yu7gbyh");
	    productName.getElements();
	}

}
