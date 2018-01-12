package com.inheritancejava.ignacio;

public class engineer extends employee {
	int SSN;

	public engineer(String firstName, String lastName, String companyTitle, int yearsAtCompany, int SSN) {
		super(firstName, lastName, companyTitle, yearsAtCompany, SSN);
		this.SSN = SSN;

	}
}
