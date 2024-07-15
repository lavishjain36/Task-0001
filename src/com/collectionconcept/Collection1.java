package com.collectionconcept;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collection1 {

	public static void main(String[] args) {
		//create an object arraylist
		List al1=new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add("Lavish");
		al1.add(10.45);
	
		
		ArrayList al2=new ArrayList();
        al2.addAll(al1);
		System.out.println(al2);
		
		al2.add(2, 45);
		System.out.println(al2);
		
		al2.add(0,12);
		System.out.println(al2);
		
		al2.add(78);
		System.out.println(al2);
		
		System.out.println(al2.get(2));
		System.out.println(al2.contains("Harini"));
		al2.clear();
		System.out.println(al2.isEmpty());
	}

}
