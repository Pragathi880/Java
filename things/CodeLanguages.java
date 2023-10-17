package com.xworkz.september.things;

public class CodeLanguages {
	public String languageName;
	public int numOfLang;
	public int numOfLines;
	public boolean codeHasClassOrNot;
	public boolean isCodeHasConstructor;
	
	public CodeLanguages() {
		System.out.println("This is Default Constructor");
	}
	
	public CodeLanguages(String languageName,int numOfLang,int numOfLines) {
		this.languageName =languageName;
		this.numOfLang = numOfLang;
		this.numOfLines = numOfLines;
		System.out.println("Name of the language:"+this.languageName+"  "+"Number of languages:"+this.numOfLang+"  "+"Number of lines in code"+this.numOfLines);
	}
	

}
