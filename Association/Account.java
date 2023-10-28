package com.xworkz.september.things;

public class Account {
	private String accountHolderName;
	private String accountNumber;
	private String accountType;
	private RD rd;
	private FD fd;
	
	public Account() {
		System.out.println("no-args constructor");
	}
	public Account(String accountHolderName, String accountNumber, String accountType, RD rd, FD fd) {
		System.out.println("All-args constructor");
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.rd = rd;
		this.fd = fd;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public RD getRd() {
		return rd;
	}
	public void setRd(RD rd) {
		this.rd = rd;
	}
	public FD getFd() {
		return fd;
	}
	public void setFd(FD fd) {
		this.fd = fd;
	}
	
	
	
	

}
