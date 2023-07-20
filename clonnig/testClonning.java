package com.rays.clonnig;

public class testClonning {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		
		
		Customer c1 = new Customer("vikash");
		Customer c2 = (Customer)c1.clone();
		
		c2.name = "sachin";
		c2.account.balance= 200;
		
		System.out.println(c1.name);
		System.out.println(c1.account.balance);
		System.out.println(c2.name);
		System.out.println(c2.account.balance);

		
		
				
	}

}
