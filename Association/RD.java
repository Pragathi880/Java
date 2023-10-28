package com.xworkz.september.things;

public class RD {
	private String period;
	private String date;
	private String id;
	
	public RD() {
		System.out.println("no-args constructor");
	}
	public RD(String period, String date, String id) {
		System.out.println("all-args constructor");
		this.period = period;
		this.date = date;
		this.id = id;
	}
	
	public void setPeriod(String period) {
		this.period = period;
	}
	public String getPeriod() {
		return period;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	public String getDate() {
		return date;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	
	
	
	

}
