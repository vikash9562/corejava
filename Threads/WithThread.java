package com.rays.Thread;

public class WithThread implements Runnable{ 
	
	String name = null;
	
	public WithThread(String name) {
		this.name = name;
		
		
	}

	@Override
	public void run() {
		for (int i = 1; i < 5; i++) {
			System.out.println(i + name);
			
		}
		
	}
}
