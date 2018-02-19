package com.visam.java.Threads;

//public class MyThread extends Thread {
 public class MyThread implements Runnable{
	 
		public void run()
		{
			System.out.println(" Thread is running");
			}
	
		
		public static void main(String args[]) {
			MyThread t1 = new MyThread();
			Thread t2 = new Thread(t1);
			t2.start();
		
			
			
		}
			
		
	

}
