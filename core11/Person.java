package com.rays.core11;

public class Person {

	private int id = 0;
	private String name = null;
	private String address = null;

	public Person(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + address;
	}

	@Override
	public boolean equals(Object obj) {

		if (!(obj instanceof Person)) {

			return false;

		}

		Person p = (Person) obj;

		boolean b = this.id == p.id && this.name == p.name && this.address == p.address;

		return b;
	}

	@Override
	public int hashCode() {

		String str = this.id + this.name + this.address;
		
		return str.hashCode();
	}

}
	
	
	



