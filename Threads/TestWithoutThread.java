package com.rays.Thread;

public class TestWithoutThread {
	
	public static void main(String[] args) {
		
		WithoutThread t1 = new WithoutThread("deepak");
		
		WithoutThread t2 = new WithoutThread("vikash");
		
		t1.start();
		t2.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main");
		}
	}

}
