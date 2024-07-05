package com.oops;

public class Person {
	//instance variable(data fields)
	String name;
	int age;
	String gender;
	double height;
	double weight;

	
	//static variable
	static int numofpersons=0;
	
	//constructor
	public Person(String name,int age,String gender,double height,double weigth) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.height=height;
		this.weight=weigth;
		numofpersons++;//increment count of person by 1 at time.
	}
	
	//Method ->instance method
	public  void getPersonDetails() {
		//local variable->created in method 
		String persondetails="Name : "+name+",Age: "+age+", Gender: "+gender+
				",Height :"+height+"m, Weight:"+weight+"kg";
		
		System.out.println(persondetails);
	}
	
	public static void main(String[] args) {
	   //create person object
		Person person1=new Person("Swapnil Selokar", 38,"Male",1.65,75.5);
		Person person2=new Person("Lavish", 39,"Male",1.55,85.5);
		Person person3=new Person("Jenny", 35,"Female",1.5,55.0);

		
		//Access person Method getPersonDetails();
		person1.getPersonDetails();
		person2.getPersonDetails();
		person3.getPersonDetails();
		
		
		//Tell me how may person are added so far?->Classname.variablename
		System.out.println("Total number of people :"+Person. numofpersons);

	}

}
