package com.xworkz.september.driver;

import com.xworkz.september.things.Employee;

public class Company1Runner {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setNameOfCompany("Accenture");
		employee.setYearOfWstablishment(1995);
		employee.setSalary(400000);
        employee.setDesignation("Software Developer");
        
        String name = employee.getNameOfCompany();
        System.out.println("Name of Company:"+name);
        int year = employee.getYearOfWstablishment();
        System.out.println("Year of Establishment:"+year);
        float salary = employee.getSalary();
        System.out.println("Salary :"+salary);
        String designation = employee.getDesignation();
        System.out.println("Designation in company:"+designation);
	}

}
