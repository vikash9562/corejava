package com.rays.clonnig;

public class testsello {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Account a1 = new Account(100);
		Account a2 = (Account)a1.clone();
				a2.balance= 200;
				System.out.println(a1.balance);
				System.out.println(a2.balance);
				
		
	}

}
