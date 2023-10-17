package com.xworkz.september.things;

public class River {
	public static void riverName(String[] name) {
		System.out.println("Name of the Rivers are:");
		System.out.println(name.length);
		for(int i=0;i<name.length;i++) {
			System.out.println("Name: "+name[i]);
		}
	}
	
	public static void placeName(String[] name, String[] place) {
		System.out.println("list of the places of River:");
		System.out.println(name.length+"  "+place.length);
		for(int j=0;j<place.length;j++) {
			System.out.println("place: " +place[j]);
		}
		for(int i=0;i<name.length;i++) {
			System.out.println("Name: "+name[i]);
		}
	}
	
	public static void placeName(String[] name, String[] place,String[] birthPlace) {
		System.out.println("list of the birthplace of River:");
		System.out.println(name.length+"  "+place.length+"  "+birthPlace.length);
		for(int k=0;k<place.length;k++) {
			System.out.println("birthplace: " +birthPlace[k]);
		}
		for(int j=0;j<place.length;j++) {
			System.out.println("place: " +place[j]);
		}
		for(int i=0;i<name.length;i++) {
			System.out.println("Name: "+name[i]);
		}
	}
	}
	

