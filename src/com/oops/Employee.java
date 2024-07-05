package com.oops;

public class Employee {
	

	//instance variable
	String name;
	int age;
	String position;
	double salary;
	
	//constructor
	public Employee(String name, int age, String position, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.salary = salary;
	}
	
	
	

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", position=" + position + ", salary=" + salary + "]";
	}




	public static void main(String[] args) {
		//create employee object
		Employee emp1=new Employee("Parvesh", 35, "Sr.Developer", 150000.00);
		Employee emp2=new Employee("Abhi", 45, "Sr.Manager", 250000.00);
		Employee emp3=new Employee("Pavan", 27, "Jr.Tester", 50000.00);

	    System.out.println(emp1.toString());
	    System.out.println(emp2.toString());
	    System.out.println(emp3.toString());

	    
	    Company.addEmployee(emp1);
	    Company.addEmployee(emp2);
	    Company.addEmployee(emp3);
	    
	    System.out.println("Total Employee :"+Company.noofemp);
	    
	}

}
