package com.xworkz.september.things;

public class Bank {
	private String bankName;
	private String branchName;
	private String location;
	private Payment payment;
	private Account account;
	
	public Bank() {
		System.out.println("No-args constructor");
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public Bank(String bankName, String branchName, String location, Payment payment, Account account) {
		System.out.println("All-args constructor");
		this.bankName = bankName;
		this.branchName = branchName;
		this.location = location;
		this.payment = payment;
		this.account = account;
	}
	
	
	

}
