package com.xworkz.september.things;

public class FD {
	private String nameOfPerson;
	private String amount;
	private String id;
	
	public FD() {
		System.out.println("No-args constructor");
	}
	public FD(String nameOfPerson, String amount, String id) {
        System.out.println("All-args constructor");
		this.nameOfPerson = nameOfPerson;
		this.amount = amount;
		this.id = id;
	}
	public void setNameOfPerson(String nameOfPerson) {
		this.nameOfPerson = nameOfPerson;
	}
	public String getNameOfPerson() {
		return nameOfPerson;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount() {
		return amount;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	
	
	
	

}
