package com.visam.java.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceCreation {
	public static void main(String args[]) {
	ExecutorService es = Executors.newFixedThreadPool(5);
	PrintTask pt =new PrintTask();
	es.execute(pt);
	

}
}
