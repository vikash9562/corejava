package com.rays.compare;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class testFailSafe {
	public static void main(String[] args) {
		
	Vector v = new Vector ();
	
	v.add(100);
	v.add(200);
	v.add(300);
	v.add(400);
	
	Enumeration en = v.elements();
	v.add("vikash");
	v.add("yadav");
	while (en.hasMoreElements()) {
		System.out.println(en.nextElement());
		
	}
	
	}

}
