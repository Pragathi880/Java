package com.xworkz.september.driver;
import com.xworkz.september.things.Engineering;
public class EngineeringRunner {
	public static void main(String args[]) {
		Engineering engineering = new Engineering();
		engineering.onSave("Information Science");
		engineering.onSave("Compurter Science");
		engineering.onSave("Electronics");
		engineering.onSave("Civil");
		engineering.onSave("Mechnical");
		engineering.onSave("AI & ML");
		engineering.getElement();
		engineering.update("Electronics", "Automobile");
		engineering.getElement();
		engineering.delete("Compurter Science");
		engineering.getElement();
		
	}

}
