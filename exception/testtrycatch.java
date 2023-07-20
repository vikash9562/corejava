package com.rays.exception;

public class testtrycatch {
	public static void main(String[] args) {
		String name = "vikash";
		try {	
		System.out.println(name.length());
		System.out.println(name.charAt(4));
			
			
		int a =10;
		System.out.println("a= "+a);
			
		int b = 3;
		System.out.println("b="+b);
		
		int c = a/b;
		System.out.println("Devision="+c);
		
		}catch (NullPointerException e) {
			System.out.println("name can't be null");
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println("String is small");	
		}catch (RuntimeException e) {
			System.out.println(e.getMessage());
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("in finlly block");
		}
		System.out.println("after axcepption");
	}
	
	
	

}
