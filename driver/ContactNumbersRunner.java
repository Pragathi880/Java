package com.xworkz.september.driver;
import com.xworkz.september.things.ContactNumbers;
public class ContactNumbersRunner {
	public static void main(String args[]) {
		ContactNumbers contactNumber = new ContactNumbers();
		contactNumber.onSave(935373772);
		contactNumber.onSave(944817535);
		contactNumber.onSave(948144854);
		contactNumber.onSave(993638363);
		contactNumber.getElements();
		
	}

}
