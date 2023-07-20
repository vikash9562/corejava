package com.rays.construcotorCalling;


public class Ractengle extends Shape {
	
	public int length= 0;
	public int width= 0;
	
	 public Ractengle() {
		 
	}
	public Ractengle(int length, int width, String Color, int borderWidth) {
		this.length= length;
		this.width= width;
		
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
	
}
