package com.bilgeadam.boost.marathon2.veyselyazici;

import java.time.LocalDate;

public class Student extends School{
	
	public static int STUDENT_ID_NUMBER = 1;
	
	private int id;
	private int parentPhone;
	
	public Student(String name, String lastName, String gender, LocalDate birthDate, LocalDate startingDate,
			int mobilePhone, int homePhone, int parentPhone, boolean marriage) 
	{
		super(name, lastName, gender, birthDate, startingDate, mobilePhone, homePhone, marriage);
		this.id = Student.STUDENT_ID_NUMBER++;
		this.parentPhone = parentPhone;
		
	}

	public static int getSTUDENT_ID_NUMBER() {
		return STUDENT_ID_NUMBER;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getParentPhone() {
		return this.parentPhone;
	}

	public void setParentPhone(int parentPhone) {
		this.parentPhone = parentPhone;
	}

	
}
