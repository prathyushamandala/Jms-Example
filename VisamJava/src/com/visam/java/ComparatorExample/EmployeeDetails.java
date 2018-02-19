package com.visam.java.ComparatorExample;

import java.util.Comparator;

import com.visam.java.collectiontopic.Data;

public class EmployeeDetails {
	private int empid;
	private float empsal;
	private String gender;
	private String desig;
	
	public int getEmpid() {
		return empid;
	}
	public EmployeeDetails(int empid, float empsal, String gender, String desig) {
		super();
		this.empid = empid;
		this.empsal = empsal;
		this.gender = gender;
		this.desig = desig;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public float getEmpsal() {
		return empsal;
	}
	public void setEmpsal(float empsal) {
		this.empsal = empsal;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((desig == null) ? 0 : desig.hashCode());
		result = prime * result + empid;
		result = prime * result + Float.floatToIntBits(empsal);
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeDetails other = (EmployeeDetails) obj;
		if (desig == null) {
			if (other.desig != null)
				return false;
		} else if (!desig.equals(other.desig))
			return false;
		if (empid != other.empid)
			return false;
		if (Float.floatToIntBits(empsal) != Float.floatToIntBits(other.empsal))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		return true;
	}
	
	//@Override
	/*public int compare(Object ed, Object ed2) {
		EmployeeDetails ed5 = (EmployeeDetails) ed;
		EmployeeDetails ed6 = (EmployeeDetails) ed2;
		if (ed5.getEmpid() == ed6.getEmpid()) {
			return 0;
		} else if ( (ed5.getEmpid() < ed6.getEmpid())){
			return -1;
		} else {
			return 1;
		}*/
		 
	public String toString() {
		return "EmployeeDetails [empid=" + empid + "]";
	}
		
	
	

}
