package com.xworkz.september.driver;
import com.xworkz.september.things.IplCricket;
public class IplCricketRunner {
	public static void main (String args[]) {
		IplCricket iplteam = new IplCricket();
		iplteam.onSave("RCB");
		iplteam.onSave("CSK");
		iplteam.onSave("PBK");
		iplteam.onSave("KKR");
		iplteam.onSave("RR");
		iplteam.onSave("LSG");
		iplteam.onSave("GT");
		iplteam.onSave("MI");
		iplteam.getElement();
		iplteam.update("DC", "MI");
		iplteam.getElement();
		iplteam.delete("LSG");
		iplteam.getElement();
		}

}
