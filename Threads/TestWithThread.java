package com.rays.Thread;

public class TestWithThread {
	public static void main(String[] args) {
		
		WithThread t1 = new WithThread("deepak");
		
		WithThread t2 = new WithThread("vikash");
		
		t1.run();
		t2.run();
		
	}

}
