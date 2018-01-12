package com.inheritancejava.ignacio;

public class employee {

	String firstName;
	String lastName;
	String companyTitle;
	int yearsAtCompany;
	int SSN;

	public employee(String firstName, String lastName, String companyTitle, int yearsAtCompany, int SSN) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.companyTitle = companyTitle;
		this.yearsAtCompany = yearsAtCompany;
		this.SSN = SSN;
	}

	public void printDetails() {
		System.out.println(this.firstName + " " + this.lastName + " " + "has worked at" + " " + this.companyTitle + " "
				+ "for" + " " + this.yearsAtCompany + " " + "year(s)");
	}
}