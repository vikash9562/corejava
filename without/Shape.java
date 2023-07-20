package com.rays.without;

public class Shape {
	
	private String color = null;
	private int boderWidth = 0;
	
	public Shape () {
		System.out.println("in defoult constector");
		
	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBoderWidth() {
		return boderWidth;
	}

	public void setBoderWidth(int boderWidth) {
		this.boderWidth = boderWidth;
	}
	public void area () {
		System.out.println("Shape method");
		System.out.println("Shape area color");
		System.out.println(("Shape area borderWidth"));
	}
	
	}


