package com.xworkz.september.driver;
import com.xworkz.september.things.Education;
import com.xworkz.september.things.Company;
import com.xworkz.september.things.JobSeeker;
import com.xworkz.september.things.Naukri;
import com.xworkz.september.things.Linkdin;
import com.xworkz.september.things.JobPortal;
public class JobPortalRunner {
	public static void main(String args[]) {
		Education education = new Education();
		education.setAutonomous(true);
		education.setInstitutionName("Malnad college of Engineering");
		education.setNameOfDegree("BE");
		education.setUniversity(true);
		education.setAmoutntPaid(65000);
		System.out.println("Details of Education");
		System.out.println(education.getNameOfDegree());
		System.out.println(education.getInstitutionName());
		System.out.println(education.getAmoutntPaid());
		System.out.println("...................................................................");

		
		Company company = new Company();
		company.setJobsAvailable(true);
		company.setNameOfCompany("Google");
		company.setNumOfEmployes(100);
		company.setPostOfJobAvailable("Software Developer");
		company.setEducation(education);
		System.out.println("Details of Company");
		System.out.println(company.getNameOfCompany());
		System.out.println(company.getNumOfEmployes());
		System.out.println(company.getPostOfJobAvailable());
		System.out.println(company.getEducation().getNameOfDegree());
		System.out.println(company.getEducation().getAmoutntPaid());
		System.out.println(company.getEducation().getInstitutionName());
		System.out.println(company.getEducation());
		System.out.println("...................................................................");
		
		JobSeeker jobseeker = new JobSeeker();
		jobseeker.setName("Pragthi R");
		jobseeker.setQualification("BE");
		jobseeker.setExperience("O years");
		jobseeker.setContactNum(935373772);
		jobseeker.setAddress("Huliyar");
		jobseeker.setSalary(27000);
		jobseeker.setEducation(education);
		System.out.println("Details of JobSeeker");
		System.out.println(jobseeker.getName());
		System.out.println(jobseeker.getQualification());
		System.out.println(jobseeker.getExperience());
		System.out.println(jobseeker.getContactNum());
		System.out.println(jobseeker.getAddress());
		System.out.println(jobseeker.getSalary());
		System.out.println(jobseeker.getEducation().getAmoutntPaid());
		System.out.println(jobseeker.getEducation().getInstitutionName());
		System.out.println(jobseeker.getEducation().getNameOfDegree());
		System.out.println(jobseeker.getEducation());
		System.out.println("...................................................................");
		
		Naukri naukri = new Naukri();
		naukri.setCompanyName("Google");
		naukri.setDesignation("Senior Developer");
		naukri.setWhichType("IT");
		naukri.setCompany(company);
		naukri.setJobseeker(jobseeker);
		System.out.println("Details of Naukri");
		System.out.println(naukri.getCompany().getNameOfCompany());
		System.out.println(naukri.getCompany().getNumOfEmployes());
		System.out.println(naukri.getCompany().getPostOfJobAvailable());
		System.out.println(naukri.getCompany().getEducation());
		System.out.println(naukri.getJobseeker().getName());
		System.out.println(naukri.getJobseeker().getQualification());
		System.out.println(naukri.getJobseeker().getContactNum());
		System.out.println(naukri.getJobseeker().getAddress());
		System.out.println(naukri.getJobseeker().getExperience());
		System.out.println(naukri.getJobseeker().getSalary());
		System.out.println(naukri.getJobseeker().getEducation());
		System.out.println("...................................................................");
		
		Linkdin linkdin = new Linkdin();
		linkdin.setCompanyName("Google");
		linkdin.setDesignation("Senior Developer");
		linkdin.setWhichType("IT");
		linkdin.setCompany(company);
		linkdin.setJobseeker(jobseeker);
		System.out.println("Details of Linkdin");
		System.out.println(linkdin.getCompany().getNameOfCompany());
		System.out.println(linkdin.getCompany().getNumOfEmployes());
		System.out.println(linkdin.getCompany().getPostOfJobAvailable());
		System.out.println(linkdin.getCompany().getEducation());
		System.out.println(linkdin.getJobseeker().getName());
		System.out.println(linkdin.getJobseeker().getExperience());
		System.out.println(linkdin.getJobseeker().getAddress());
		System.out.println(linkdin.getJobseeker().getQualification());
		System.out.println(linkdin.getJobseeker().getContactNum());
		System.out.println(linkdin.getJobseeker().getSalary());
		System.out.println(linkdin.getJobseeker().getEducation());
		System.out.println("...................................................................");
		
		JobPortal jobportal = new JobPortal();
        jobportal.setAppAvailable(true);
        jobportal.setPortalName("Linkdin");
        jobportal.setRating(8.9f);
        jobportal.setLinkdin(linkdin);
        jobportal.setNaukri(naukri);
        System.out.println(jobportal);
        
	}

}
