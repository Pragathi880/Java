package com.xworkz.september.things;

public class Trainee {
	public static void traineeName(String[] name) {
		System.out.println("To print names of trainee....:");
		System.out.println("To print length of names:"+name.length);
	for(int i=0;i<name.length;i++) {
		
		if(name[i]=="Pragathi") {
			System.out.println("The name is matched");
			
		}else if(name[i]!="Chandan") {
			System.out.println("not matched");
		}else 
			System.out.println("..........");
			
	     System.out.println("name:"+name[i]);
	}

}
}
