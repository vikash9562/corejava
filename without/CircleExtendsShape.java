package com.rays.without;

public class CircleExtendsShape {
	
	private int radius;
	
	public static final double Pi=3.14;
	
	public void Circle(int radius) {
		this.radius=radius;
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void area () {
		double Carea=(Pi* radius* radius);
		
		System.out.println("area of Circle=");
		
	}

}
