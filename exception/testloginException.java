package com.rays.exception;

public class testloginException {
	
	public static void main(String[] args) {
		
		try {
			String name = "admin";
			if (name.equals("admin")) {
				System.out.println("valid User....!!!");
				
			}else
				throw new LoginException();
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}

