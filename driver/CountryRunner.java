package com.xworkz.september.driver;
import com.xworkz.september.things.Country;
public class CountryRunner {
	public static void main (String args[] ){
		Country country = new Country();
		country.onSave("INDIA");
		country.onSave("AFGANISTHAN");
		country.onSave("CHINA");
		country.onSave("BANGALADESH");
		country.getElement();
		country.update("CHINA", "PAKISTHAN");
		country.getElement();
		country.delete("BANGLADESH");
		country.getElement();
		
	}

}
