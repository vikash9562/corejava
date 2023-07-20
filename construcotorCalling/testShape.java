package com.rays.construcotorCalling;
 
public class testShape {
	
	public static void main(String[] args) {
		
		Ractengle  r = new Ractengle ();
		
		r.setBorderWidth(49);
		r.setColor("red");
		r.setLength(40);
		r.setWidth(50);
		
		System.out.println(r.getBorderWidth());
		System.out.println(r.getColor());
		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		
		
		
		
		
	}

}
