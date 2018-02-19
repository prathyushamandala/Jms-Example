package com.visam.java.ComparatorExample;

import java.util.Comparator;

public class ComparatorImp implements Comparator{
	public int compare(Object ed, Object ed2) {
		EmployeeDetails ed5 = (EmployeeDetails) ed;
		EmployeeDetails ed6 = (EmployeeDetails) ed2;
		if (ed5.getEmpid() == ed6.getEmpid()) {
			return 0;
		} else if ( (ed5.getEmpid() < ed6.getEmpid())){
			return -1;
		} else {
			return 1;
		}
	}
}


