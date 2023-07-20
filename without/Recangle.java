package com.rays.without;

public class Recangle extends Shape {
	
	private int length ;
	private int width ;
	
	public Recangle (int length, int widht, String color , int boderWidth) {
		
		this.length=length;
		this.width=width;
		
		
		
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	public void area () {
		int rarea=getLength()*getWidth();
		System.out.println("RectangleArea =+rarea");
				
	}


}
