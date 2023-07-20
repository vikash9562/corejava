package com.rays.construcotorCalling;

public class Shape {
	
	private String Color = null;
	private int borderWidth = 0;
	
	public Shape() {
		System.out.println("defoult constector");
			
	}
	public Shape(String Color, int borderWidth) {
		this.Color= Color;
		this.borderWidth= borderWidth;
		
	}
	
	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

}
