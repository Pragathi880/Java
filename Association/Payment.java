package com.xworkz.september.things;


public class Payment {
	private String typeOfPayment;
	private boolean onlinePayment;
	private int amount;
	private Online online;
	
	public Payment() {
		System.out.println("No-args constructor");
	}
	public Payment(String typeOfPayment, boolean onlinePayment, int amount, Online online) {
		System.out.println("All-args constructor");
		this.typeOfPayment = typeOfPayment;
		this.onlinePayment = onlinePayment;
		this.amount = amount;
		this.online = online;
	}
	public String getTypeOfPayment() {
		return typeOfPayment;
	}
	public void setTypeOfPayment(String typeOfPayment) {
		this.typeOfPayment = typeOfPayment;
	}
	public boolean isOnlinePayment() {
		return onlinePayment;
	}
	public void setOnlinePayment(boolean onlinePayment) {
		this.onlinePayment = onlinePayment;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Online getOnline() {
		return online;
	}
	public void setOnline(Online online) {
		this.online = online;
	}
	
	
	
	

}
