package com.visam.java.collectiontopic;

public class Data implements Comparable {

	private String studentname;
	private int rollno;

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + rollno;
		result = prime * result + ((studentname == null) ? 0 : studentname.hashCode());
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
		Data other = (Data) obj;
		if (rollno != other.rollno)
			return false;
		if (studentname == null) {
			if (other.studentname != null)
				return false;
		} else if (!studentname.equals(other.studentname))
			return false;
		return true;
	}

	@Override
	public int compareTo(Object arg0) {

		Data d = (Data) arg0;
		if (d.getRollno() == rollno) {
			return 0;
		} else if (d.getRollno() > rollno) {
			return -1;
		} else {
			return 1;
		}

	}
	
	public String toString() {
		return "[rollno= "+ rollno +"]";
	}

}
