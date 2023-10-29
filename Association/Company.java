package com.xworkz.september.things;

public class Company {
	private String nameOfCompany;
	private boolean jobsAvailable;
	private String postOfJobAvailable;
	private int numOfEmployes;
	private Education education;
	
	public Company() {
		System.out.println("No-args constructor");
	}
	public Company(String nameOfCompany, boolean jobsAvailable, String postOfJobAvailable, int numOfEmployes,
			Education education) {
		System.out.println("All-args constructor");
		this.nameOfCompany = nameOfCompany;
		this.jobsAvailable = jobsAvailable;
		this.postOfJobAvailable = postOfJobAvailable;
		this.numOfEmployes = numOfEmployes;
		this.education = education;
	}
	public String getNameOfCompany() {
		return nameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		this.nameOfCompany = nameOfCompany;
	}
	public boolean isJobsAvailable() {
		return jobsAvailable;
	}
	public void setJobsAvailable(boolean jobsAvailable) {
		this.jobsAvailable = jobsAvailable;
	}
	public String getPostOfJobAvailable() {
		return postOfJobAvailable;
	}
	public void setPostOfJobAvailable(String postOfJobAvailable) {
		this.postOfJobAvailable = postOfJobAvailable;
	}
	public int getNumOfEmployes() {
		return numOfEmployes;
	}
	public void setNumOfEmployes(int numOfEmployes) {
		this.numOfEmployes = numOfEmployes;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	
	

}
