package com.rays.compare;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class testEmployee {
	
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new Employee(1,"depansu", "khargone"));
		list.add(new Employee(3,"deepak", "ashoknagar"));
		list.add(new Employee(5,"sachin", "bherunda"));
		list.add(new Employee(7,"aman", "khargone"));
		list.add(new Employee(4,"jatin", "aasta"));
		list.add(new Employee(6,"rahul", "khargone"));
		list.add(new Employee(8,"vikash", "chapda"));
		
				
				
				Collections.sort(list);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	
		
		
		
	}

}
