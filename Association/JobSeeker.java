package com.xworkz.september.things;

public class JobSeeker {
	private String name;
	private String address;
	private String qualification;
	private int contactNum;
	private String experience;
	private int salary;
	private Education education;
	
	public JobSeeker() {
		System.out.println("No-args constructor");
	}
	public JobSeeker(String name, String address, String qualification ,int contactNum, String experience, int salary,
			Education education) {
		System.out.println("All-args constructor");
		this.name = name;
		this.address = address;
		this.qualification = qualification;
		this.contactNum = contactNum;
		this.experience = experience;
		this.salary = salary;
		this.education = education;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getContactNum() {
		return contactNum;
	}
	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Education getEducation() {
		return education;
	}
	public void setEducation(Education education) {
		this.education = education;
	}
	
	
	
	

}
