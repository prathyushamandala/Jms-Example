package com.visam.java.MapCollectiontypes;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExamplechm {
	ConcurrentHashMap<Integer, String> chm = new ConcurrentHashMap<Integer, String>();

	public static void main(String args[]) {

		// chm.put(1001,"Arun");
		// chm.put(1003,"Bob");
		// chm.put(1002,"cathy");

		ExecutorServiceExamplechm e1 = new ExecutorServiceExamplechm();
		ExecutorService es = Executors.newFixedThreadPool(3);
		es.execute(e1.new Homeloan());
		es.execute(e1.new Personalloan());
		es.execute(e1.new Eduloan());

	}

	public class Homeloan implements Runnable {

		@Override
		public void run() {
			chm.put(1001, "jack");
			chm.put(1003, "gibs");

		}
	}

	public class Personalloan implements Runnable {

		public void run() {
			Iterator itr = chm.entrySet().iterator();
			while (itr.hasNext()) {
				chm.put(1006, "new1");
			}
			System.out.println(itr.next());
		}
	}

	public class Eduloan implements Runnable {

		@Override
		public void run() {
			Iterator itr1 = chm.entrySet().iterator();
			while (itr1.hasNext()) {
				chm.put(1008, "new2");
			}
			System.out.println(itr1.next());
		}

	}
}
