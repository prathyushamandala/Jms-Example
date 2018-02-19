package com.visam.java.WordSplit;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SplitWord {
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a string to split :");
		String str= sc.nextLine();
		List <String> lst = new ArrayList();
		//char[] ch =str.toLowerCase().toCharArray();
		//String str1 = ch.toString();
		String[] str1=str.split("_");
		System.out.println( "" +str1);
		
	}
}
				
