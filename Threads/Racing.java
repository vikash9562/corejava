package com.rays.Thread;

public class Racing extends Thread{
	
	public static Account account = new Account ();
	
	String msg = null;
	
	public Racing (String msg) {
		this.msg= msg;
		
	}
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {	
			account.deposit(msg, 500);
			
		}
	}
	

}
