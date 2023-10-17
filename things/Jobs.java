package com.xworkz.september.things;

public class Jobs {
	public String typeOfJob;
	public String companyName;
	public String position;
	public int salary;
	public String jobTimeings;
	
	public Jobs() {
	    System.out.println("This is the constructor of the class name Jobs");
	}
	
	public Jobs(String companyName,String typeOfJob,String position,int salary) {
		this.companyName = companyName;
		this.typeOfJob = typeOfJob;
		this.position = position;
		this.salary = salary;
		System.out.println("Name of company:"+this.companyName+"  "+"type of the Jobs:"+this.typeOfJob+"  "+"Position name of the job:"+this.position+"  "+"Salary given to this job:"+this.salary);
	}
}
