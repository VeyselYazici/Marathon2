package com.bilgeadam.boost.marathon2.veyselyazici;

import java.time.LocalDate;

public abstract class School 
{	
	
	private String name;
	private String lastName;
	private String gender;
	private LocalDate birthDate;
	private LocalDate startingDate;
	private int mobilePhone;
	private int homePhone;
	private boolean marriage;
	
	public School(String name, String lastName, String gender, LocalDate birthDate, LocalDate startingDate,
			int mobilePhone, int homePhone, boolean marriage) 
	{
		super();
		this.name = name;
		this.lastName = lastName;
		this.gender = gender;
		this.birthDate = birthDate;
		this.startingDate = startingDate;
		this.mobilePhone = mobilePhone;
		this.homePhone = homePhone;
		
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public int getMobilePhone() {
		return this.mobilePhone;
	}

	public void setMobilePhone(int mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public int getHomePhone() {
		return this.homePhone;
	}

	public void setHomePhone(int homePhone) {
		this.homePhone = homePhone;
	}

	public LocalDate getStartingDate() {
		return this.startingDate;
	}

	public void setStartingDate(LocalDate startingDate) {
		this.startingDate = startingDate;
	}
	
	public boolean isMarriage() 
	{
		return this.marriage ;
	}


	public void setMarriage(boolean marriage) {
		this.marriage = marriage;
	}

	

	

	
	
	
	

}
