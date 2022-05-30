package com.bilgeadam.boost.marathon2.veyselyazici;

import java.util.List;

public class Lesson <T extends Student> 
{
	
	private String lessonName;
	private int lessonsHour;
	private String day;

	public Lesson(EmployeePosition position, List<SchoolEmployee> employees, SchoolEmployee employe, String lessonName,
			int lessonsHour, String day) {
		super();
		
		this.lessonName = lessonName;
		this.lessonsHour = lessonsHour;
		this.day = day;
		
	}

	

	public String getLessonName() {
		return this.lessonName;
	}

	public void setLessonName(String lessonName) {
		this.lessonName = lessonName;
	}

	public int getLessonsHour() {
		return this.lessonsHour;
	}

	public void setLessonsHour(int lessonsHour) {
		this.lessonsHour = lessonsHour;
	}

	public String getDay() {
		return this.day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	
	
	
	
	
	
}
