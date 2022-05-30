package com.bilgeadam.boost.marathon2.veyselyazici;

public enum EmployeePosition 
{
	OFFICIAL("Memur"), TEACHER("Ogretmen"), SERVANT("Hizmetli");

	private String employeePosition;

	EmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}
	
	public String getEmployeePosition() {
		return this.employeePosition;
	}
}
