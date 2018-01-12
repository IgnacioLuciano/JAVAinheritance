package com.inheritancejava.ignacio;

public class designer extends employee {
	int SSN;

	public designer(String firstName, String lastName, String companyTitle, int yearsAtCompany, int SSN) {
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN);
		this.SSN = SSN;

	}
}
