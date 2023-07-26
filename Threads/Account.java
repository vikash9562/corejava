package com.rays.Thread;

public class Account {

	private int balance =0;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}	

   public synchronized void deposit (String msg, int amount) {
	   int balance = getBalance();
	   balance = balance +amount;
	   setBalance(balance);
	   System.out.println(msg+" "+getBalance());
	   
	
}

}