package com.std;

public class GraduateStudent extends Student{
	String specialization;

	//constructor
	public GraduateStudent(String name, int age,String specialization) {
		super(name, age);
		this.specialization=specialization;
	}

	
	//overriding studentdetails 
	@Override
	public void getstudentdetails() {
		System.out.println("Name :"+name+" ,Age: "+age+",Specialization: "+specialization);
	}
	
	//overridden method

	

}
