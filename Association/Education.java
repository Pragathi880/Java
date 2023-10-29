package com.xworkz.september.things;

public class Education {
	private boolean autonomous;
	private String nameOfDegree;
	private String institutionName;
	private int amoutntPaid;
	private boolean university;
	
	public Education() {
		System.out.println("No-Args constructor");
	}
	public Education(boolean autonomous, String nameOfDegree, String institutionName, int amoutntPaid,
			boolean university) {
        System.out.println("All-Args constructor");
		this.autonomous = autonomous;
		this.nameOfDegree = nameOfDegree;
		this.institutionName = institutionName;
		this.amoutntPaid = amoutntPaid;
		this.university = university;
	}
	public boolean isAutonomous() {
		return autonomous;
	}
	public void setAutonomous(boolean autonomous) {
		this.autonomous = autonomous;
	}
	public String getNameOfDegree() {
		return nameOfDegree;
	}
	public void setNameOfDegree(String nameOfDegree) {
		this.nameOfDegree = nameOfDegree;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public int getAmoutntPaid() {
		return amoutntPaid;
	}
	public void setAmoutntPaid(int amoutntPaid) {
		this.amoutntPaid = amoutntPaid;
	}
	public boolean isUniversity() {
		return university;
	}
	public void setUniversity(boolean university) {
		this.university = university;
	}
}
