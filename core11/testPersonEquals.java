package com.rays.core11;

public class testPersonEquals {
	public static void main(String[] args) {
		
		Person p1 = new Person(1, "vikash", "bhopal");
		Person p2 = new Person(1, "vikash", "bhopal");
		Person p3 = new Person(1, "vikash", "bhopal");
		Person p4 = new Person(1, "vikash", "bhopal");
		
		
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
		System.out.println(p3.hashCode());
		System.out.println(p4.hashCode());
		
		
		
	}

}
