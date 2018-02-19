package com.visam.java.PractiseCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AddEltToLst {
	public static void main(String args[]) {
		List<Integer> lst = new ArrayList<Integer>(); // Method 1:create and object of list and add
		lst.add(10);
		lst.add(20);
		lst.add(40);
		lst.add(30);
		Collections.sort(lst);
		System.out.println(lst);
		
		//List<Integer> lst1 =Arrays.asList(10,20,30,10); // fixed size of array java8 feature
		//for(Integer integer: lst1)
		//System.out.println(integer);
		
		
	}

}
