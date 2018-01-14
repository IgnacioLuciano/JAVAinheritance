package com.inheritancejava.ignacio;

public class Startup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		manager manager = new manager("Ignacio","Luciano","GM Management",5,-1);
		manager.printDetails();
		
		engineer engineer = new engineer("Martina","Muller","KLM LLC",2,-1);
		engineer.printDetails();
		
		designer designer = new designer("Lucas","Bonetto","PT Design",7,-1);
		designer.printDetails();
	}	


	}

