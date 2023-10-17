package com.xworkz.september.driver;

import com.xworkz.september.things.OTT;

public class OTTRunner {
	public static void main(String args[]) {
		OTT.watch();
		OTT.watch("Googly");
		OTT.watch(6, "Prime Video");
		OTT.watch("Manikya", 4);
		OTT.watch("Bachan", "Kannada");
		OTT.watch("Pailwam", "Kannada", 4.5f);
		OTT.watch("Prime Video", 3.5f, 5);
		OTT.watch("Jawan",4.0f,"Hotstar");
		OTT.watch(3,"Gaja",4.5f);
		OTT.watch("Movie",4.8f,6,"KGF");
		OTT.watch(4,"series",1,"Korean Drama");
		OTT.watch("Netflix",4.5f,4);
		OTT.watch(6,"voot");
		OTT.watch(4,"Love Birds","movie","PrimeVideo");
		OTT.watch("Hotstar","Movie",3.8f,"Bheeshma");
		OTT.watch(5,"Kempegowda","Movie"," Youtube",3);
		
		OTT.updateProfile();
		OTT.updateProfile("PRAGATHI R");
		OTT.updateProfile("PRAGATHI R",true);
		OTT.updateProfile(false,"pragathirajshekar");
		OTT.updateProfile(true,"RAHUL U");
		
		OTT.channel();
		OTT.channel(234);
		OTT.channel("ZEE Kannada");
		OTT.channel("Colors Kannada", 546);
		OTT.channel("Kannada", "Star Suvarna");
		OTT.channel("Public TV", "Kannada", 435);
		OTT.channel(6542, "HD", "SUN TV","TELUGE" );
		OTT.channel("HD", 962, "Star Sports", "Hindi");
		OTT.channel("HD", " DD Chandana", "Kannada", 587);
		
		OTT.language();
		OTT.language("JAVA");
		OTT.language(234, "JAVA");
		OTT.language("Python",23);
		OTT.language(76, 8, "Python");
		OTT.language(65, "C", 8);
	    OTT.language(7.8f, 74 ,9, "C++");
	    OTT.language(72, 8.9f, 9,"JAVA");
	    OTT.language(82, 7, 6.8f, "C#");
	    OTT.language(92, 9, "AI", 8.5F);
	    OTT.language(75, 9,"PYTHON", 8.6f);
	    OTT.language(false, 45, 7, 7.3f, "C++");
	    OTT.language(8.6f, 79, 8, true, "ML");
	    OTT.language(83, false, 9.2f, 9, "Java");
	    OTT.language(93, true, 6, 6.3f, "C");
	    OTT.language(91, 7.3f, 7, false, "DBMS");
	    OTT.language(98, 8, false, 8.4f, "Data Science");
	    OTT.language(56, 8, true, "python", 8.1f);
	    OTT.language(88, 9, 9.2f, false, "DS");
	    OTT.language(89, 5, 5.4f, "C", false);
	}
	

}
