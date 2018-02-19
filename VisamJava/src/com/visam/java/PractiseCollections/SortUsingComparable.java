package com.visam.java.PractiseCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortUsingComparable {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3= new Employee();
		Employee e4 = new Employee();
		
		e1.setEmpid(1001);
		e4.setEmpid(1004);
		e3.setEmpid(1003);
		e2.setEmpid(1002);
		
		List<Employee> lst = Arrays.asList(e4,e2,e1,e3);
		
		System.out.println("elements before sorting :" +lst);
		Collections.sort(lst);
		System.out.println("elements after sorting: " +lst);
		
		
	}

}
