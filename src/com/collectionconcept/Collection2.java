package com.collectionconcept;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class Collection2 {

	public static void main(String[] args) {
		//create an object TreeSet
		TreeSet ts1=new TreeSet<>();
		ts1.add("Lavish");
		ts1.add("Vijay");
		ts1.add("Suman");
		ts1.add("Lavish");
		ts1.add("Vijay");
		
		System.out.println(ts1);
		Iterator itr=ts1.descendingIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

		}
		



		
		
		

	}

}
