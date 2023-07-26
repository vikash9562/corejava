package com.rays.Thread;

public class WithoutThread extends Thread {
	
	String name = null;
	
	public WithoutThread (String name) {
		this.name = name;
		
		
	}@Override
	public void run() {
	  for (int i = 0; i < 5; i++) {
		
		  System.out.println(i+name);
	}
	}
	
	

}
