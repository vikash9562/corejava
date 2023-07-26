package com.rays.Thread;

public class TestRacing {
	public static void main(String[] args) {
		
		Racing t1 = new Racing("deepak");
		Racing t2 = new Racing("vikash");
		
		
		t1.start();
		t2.start();
	}

}
