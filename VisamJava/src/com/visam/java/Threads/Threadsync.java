package com.visam.java.Threads;

//public class Threadsync extends Thread
public class Threadsync implements Runnable
{
	public void run() {
		// System.out.println("thread printed");
		 
		 add();
		 }
	public  synchronized void add() {
		
		for(int i=0;i<5;i++) {
			System.out.println(+i);
		}
		
	}
	 
 public static void main(String args[]) {
	 Threadsync t= new Threadsync();
	 Threadsync tt1 = new Threadsync();
	 Thread t1 = new Thread(t);
	 Thread t2 = new Thread(t);
	 Thread t3 = new Thread(tt1);
	 Thread t4 = new Thread(tt1);
	// Thread t3 =new Thread(t);
	
	  //Threadsync t2= new Threadsync();
	  t1.start();
	  t2.start();
	  t3.start();
	  t4.start();
	 
	 
 }
	
}
