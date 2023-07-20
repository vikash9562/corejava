package com.rays.Collection;

import java.util.ArrayList;
import java.util.List;

public class Listinterface {
	public static void main(String[] args) {
		
	  List l = new ArrayList();
	  
	  l.add(0, 100);
	  l.add(1, 200);
	  l.add(2, 300);
	  l.add(3, 400);
	  l.add(4, 500);
	  l.add(5, "vikash");
	  
	  
	  //System.out.println(l);
	  
	  l.get(1);
	  
	 // System.out.println(l.get(1));
	  
	  //System.out.println(l.set(3, "vikash"));
	  //System.out.println(l);
	  
	  //System.out.println(l.remove(5));
	  //System.out.println(l);
	  
	  //System.out.println(l.indexOf(400));
	  //System.out.println(l);
	  
	  System.out.println(l.lastIndexOf(0));
	  System.out.println(l);
	 
	  
	}

}
