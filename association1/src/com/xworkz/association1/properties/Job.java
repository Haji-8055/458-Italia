package com.xworkz.association1.properties;

public class Job {

	JobCompany company=new JobCompany();
	
	public void display(int salary, String role, Boolean bond) {
		System.out.println("====printing job details====");
		System.out.println(" salary : " + salary);
		System.out.println(" role : " + role);
		System.out.println(" bond : " + bond);
		
		company.display("Xworkz", "Omkar");
		/*public void setCompany(Company company)
		 * {
		 * this.copmany=company;
		 * }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * */
		

	}

}
