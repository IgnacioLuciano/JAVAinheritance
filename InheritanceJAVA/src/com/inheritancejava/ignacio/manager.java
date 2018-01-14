package com.inheritancejava.ignacio;

public class manager extends employee {
    int SSN;

    public manager(String firstName, String lastName, String companyTitle, int yearsAtCompany, int SSN)    {
       super(firstName, lastName, companyTitle, yearsAtCompany, SSN);
        this.SSN = SSN;

    }    
}