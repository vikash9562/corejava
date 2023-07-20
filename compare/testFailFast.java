package com.rays.compare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class testFailFast {
	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.add(600);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		

					
				}
	}


