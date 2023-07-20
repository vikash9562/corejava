package com.rays.exception;

public class testUnchecked {
	
	public static void main(String[] args) {
		
		int a= 10;
		
		if (a > 0) {
			
			try {
				throw new Unchecked ();
				
			} catch (Exception e) {
				System.out.println(e);
			
			}
			
		}else {
			System.out.println(" a is less tha 10");
		}
		System.out.println("after is else");
	} 

}
