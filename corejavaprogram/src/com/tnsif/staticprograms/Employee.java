package com.tnsif.staticprograms;

public class Employee {
	int eid;
	String name;
	static String companyname="TCS";
	
	Employee(int r, String n){
	eid=r;
	name=n;
	}
	void display() {
		System.out.println(eid+" "+name+" "+companyname);

	}
	public static void main(String[] args) {
		Employee e1=new Employee(1,"thanush");
		Employee e2=new Employee(2,"sravani");
		Employee e3=new Employee(3,"rakesh");
		 e1.display();
		 e2.display();
		 e3.display();
		
		
		
		
		
	}
	
	

	
}