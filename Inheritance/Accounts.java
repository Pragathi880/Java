package com.xworkz.september.things;

public class Accounts extends Bank1{
	public Accounts() {
		super("Canara","Huliyar","IFSENUM32527864",true);
		System.out.println("This is derived class constructor");
		System.out.println(super.getName());
		System.out.println(super.getBranch());
		System.out.println(super.getIFSECode());
		System.out.println(super.isNetBanking());
		System.out.println("The end of constructor chaining");
		
	}

}
