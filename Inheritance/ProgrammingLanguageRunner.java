package com.xworkz.september.driver;

import com.xworkz.september.things.HighLevel;

public class ProgrammingLanguageRunner {
	public static void main(String[] args) {
		HighLevel highlevel =new HighLevel();
		highlevel.setName("JAVA");
		highlevel.setIdeName("Eclipse");
		highlevel.setOpenSource(true);
		highlevel.setVersion("JAVA 1.8");
		
		String name =highlevel.getName();
		System.out.println("name of programming language:"+name);
		String idename = highlevel.getIdeName();
		System.out.println("Name of ide"+idename);
		boolean opensource = highlevel.isOpenSource();
		System.out.println("Is language is freely available:"+opensource);
		String version = highlevel.getVersion();
		System.out.println("Version available:"+version);
	}

}
