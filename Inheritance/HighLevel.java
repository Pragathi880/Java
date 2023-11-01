package com.xworkz.september.things;

public class HighLevel extends ProgrammingLanguage {
	public HighLevel() {
	super("JAVA","Eclipse",true,"JAVA 1.8");
	System.out.println("This is derived class constructor");
	System.out.println(super.getName());
	System.out.println(super.getIdeName());
	System.out.println(super.isOpenSource());
	System.out.println(super.getVersion());
	System.out.println("The end of constructor chaining");
	}
}
