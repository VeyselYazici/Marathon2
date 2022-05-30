package com.bilgeadam.boost.marathon2.veyselyazici;

import java.time.LocalDate;
import java.time.Period;

public class SchoolEmployee extends School{
	public static int EMPLOYEE_ID_NUMBER = 1;
	private EmployeePosition employeepositions;
	private int registrationNumber;
	private int salary;
	private String middleName;
	private LocalDate jobExitDate;


	public SchoolEmployee(String name, String lastName, String gender, LocalDate birthDate, LocalDate startingDate,
			int mobilePhone, int homePhone, EmployeePosition employeepositions, int salary, String middleName, boolean marriage) 
	{
		super(name, lastName, gender, birthDate, startingDate, mobilePhone, homePhone, marriage);
		this.employeepositions = employeepositions;
		this.salary = salary;
		this.middleName = middleName;
		this.registrationNumber = SchoolEmployee.EMPLOYEE_ID_NUMBER++;
	}
	
	public SchoolEmployee(String name, String lastName, String gender, LocalDate birthDate, LocalDate startingDate,
			int mobilePhone, int homePhone, EmployeePosition employeepositions, int salary,
			String middleName, boolean marriage, LocalDate jobExitDate) {
		this(name, lastName, gender, birthDate, startingDate, mobilePhone, homePhone, employeepositions,  salary, middleName, marriage);
		this.jobExitDate = jobExitDate;
	}

	public static int getEMPLOYEE_ID_NUMBER() {
		return EMPLOYEE_ID_NUMBER;
	}

	public EmployeePosition getEmployeepositions() {
		return this.employeepositions;
	}


	public void setEmployeepositions(EmployeePosition employeepositions) {
		this.employeepositions = employeepositions;
	}


	public int getRegistrationNumber() {
		return this.registrationNumber;
	}


	public void setRegistrationNumber(int registrationNumber) {
		this.registrationNumber = registrationNumber;
	}


	public int getSalary() {
		return this.salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public String getMiddleName() {
		return this.middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	

	public LocalDate workTime()
	{
		Period time = Period.between(getStartingDate(), getJobExitDate());
		LocalDate workingTime = LocalDate.of(time.getYears(), time.getMonths(), time.getDays());
		return workingTime;
	}
	
	public LocalDate getJobExitDate() {
		return this.jobExitDate;
	}

	public void setJobExitDate(LocalDate jobExitDate) {
		this.jobExitDate = jobExitDate;
	}



	@Override
	public String toString() {
		return this.getRegistrationNumber() + " - " + this.getName();
	}

	

	

	

	
	
	
}
