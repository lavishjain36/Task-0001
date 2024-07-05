package com.oops;

public class Rectangle {
	
	//Static block->it is part of class->loads only for once
	static {
		System.out.println("This is static Block..");
	}
	//Instance block->it is part of object
	
	{
		System.out.println("This is instance block");
	}
	
	//constructor->No-parameterized
	public Rectangle(){
		System.out.println("0-Argument Rectangle constructor");
	}
	
	//Constructor-Parameterized
	public Rectangle(int length,int breadth){
		System.out.println("2-Argument Rectangle constructor");

		//intialize length and breadth
    	this.length=length;//100;
    	this.breadth=breadth;//300;
	}
	
	//define data members
	int length,breadth;//has a part
	
	//Method-1->Instance method
	public int getPerimeter(int length,int breadth) {	
		return 2*(length+breadth);
	}
	
	//Method-2->static method
	public static int getAreaofRectangle(int length,int breadth) {
		//Method Body
		return length*breadth;
	}

	//Main method
	public static void main(String[] args) {
		//Reference variable ->can be used to refer the object
		Rectangle rc1=new Rectangle();
		Rectangle rc2=new Rectangle(100,300);
		Rectangle rc3=new Rectangle(300,400);

		
		//method to calculate perimeter of rectangle
     System.out.println(rc3.getPerimeter(15,25));
     System.out.println(Rectangle.getAreaofRectangle(100, 200));

	}
//	The static method getAreaofRectangle(int, int) from the type Rectangle should be accessed in a static way
}
