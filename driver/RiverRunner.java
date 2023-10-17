package com.xworkz.september.driver;

import com.xworkz.september.things.River;

public class RiverRunner {
	public static void main(String args[]) {
		String[] name = {"Ganga","Yamuna","Tungabhadra","Kaveri","Brahmaputra","Krishna","Narmada","Pavana"};
		River.riverName(name);
		String[] place = {"Bay of Bengal","Allahabad","Telangana","Bay of Bengal","Bay of Bengal","Andhra Pradesh","Gulf of Cambay","Mula River"};
		River.placeName(name, place);
		String[] birthPlace = {"Uttarkhand","Uttarkhand"," Karnataka","Karnataka","Arunalchal Pradesh","Maharastra","Madhya Pradesh","Maharastra"};
		River.placeName(name, place,birthPlace);
	}

}
