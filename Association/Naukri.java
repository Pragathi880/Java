package com.xworkz.september.things;

public class Naukri {
	private String companyName;
	private  String designation;
	private String whichType;
	private Company company;
	private JobSeeker jobseeker;
	
	public Naukri() {
		System.out.println("No-args construction");
	}
	public Naukri(String companyName, String designation, String whichType, Company company, JobSeeker jobseeker) {
		System.out.println("All-args construction");
		this.companyName = companyName;
		this.designation = designation;
		this.whichType = whichType;
		this.company = company;
		this.jobseeker = jobseeker;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getWhichType() {
		return whichType;
	}
	public void setWhichType(String whichType) {
		this.whichType = whichType;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public JobSeeker getJobseeker() {
		return jobseeker;
	}
	public void setJobseeker(JobSeeker jobseeker) {
		this.jobseeker = jobseeker;
	}
	

}
