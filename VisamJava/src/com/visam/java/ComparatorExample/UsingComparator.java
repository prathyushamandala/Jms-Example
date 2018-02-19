package com.visam.java.ComparatorExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.visam.java.PractiseCollections.Employee;

public class UsingComparator {
	
	public static void main(String args[]) {
		EmployeeDetails ed = new EmployeeDetails(1001, 2500, "F", "Clerk");
		EmployeeDetails ed1 = new EmployeeDetails(1004, 2580, "M", "Analyst");
		EmployeeDetails ed2 = new EmployeeDetails(1002, 3000, "F", "Architect");
		EmployeeDetails ed3 = new EmployeeDetails(1003, 3456, "M", "Developer");
		List<EmployeeDetails> lst = new ArrayList<EmployeeDetails>();
		lst.add(ed);
		lst.add(ed2);
		lst.add(ed1);
		lst.add(ed3);
		Collections.sort(lst,new ComparatorImp());
		System.out.println(lst);
 	
		
		
	}

}
