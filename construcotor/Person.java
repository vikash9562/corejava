package com.rays.construcotor;

public class Person {

	private int id = 0;
	private String name = null;
	private String Address = null;
	
	public  Person () {
		
		System.out.println("in constucotor");
			
	}
	public Person (int id) {
		
	}
	public Person (int id, String name) {
		
	}
	public Person ( int id, String name, String address) {
		System.out.println(this.setId(id));
		System.out.println(this.setName(name));
		System.out.println(this.Address=Address);
		
		
	}
	public int getId() {
		return id;
	}
	public int setId(int id) {
		this.id = id;
		return id;
	}
	public String getName() {
		return name;
	}
	public String setName(String name) {
		this.name = name;
		return name;
	}
}
