package com.visam.java.PractiseCollections;

import com.visam.java.collectiontopic.Data;

public class Employee implements Comparable{
	
	private int empid;
	private float empsal;
	private String Gender;
	
	

	public int getEmpid() {
		return empid;
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
		return Gender;
	}



	public void setGender(String gender) {
		Gender = gender;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Gender == null) ? 0 : Gender.hashCode());
		result = prime * result + empid;
		result = prime * result + Float.floatToIntBits(empsal);
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
		Employee other = (Employee) obj;
		if (Gender == null) {
			if (other.Gender != null)
				return false;
		} else if (!Gender.equals(other.Gender))
			return false;
		if (empid != other.empid)
			return false;
		if (Float.floatToIntBits(empsal) != Float.floatToIntBits(other.empsal))
			return false;
		return true;
	}



	@Override // comparable compareto() only takes one object to compare 
	public int compareTo(Object arg0) {
		Employee e = (Employee) arg0;
		if (e.getEmpid() == empid) {
			return 0;
		} else if (e.getEmpid() > empid) {
			return -1;
		} else {
			return 1;
		}
	}
	
	public String toString() {
		return "[empid= "+ empid +"]";
	}
}

	
	


