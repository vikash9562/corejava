package com.rays.Thread;

public class TesrByRunnable {
	public static void main(String[] args) {
		
		ByRunnable R1 = new ByRunnable("deepak");
		ByRunnable R2 = new ByRunnable("vikash");
		
		Thread t1 = new Thread(R1);
		Thread t2 = new Thread(R2);
		
		t1.start();
		t2.start();

}
}