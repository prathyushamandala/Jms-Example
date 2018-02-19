package com.visam.java.collectiontopic;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ComparableExample {
	public static void main(String args[]) {

	Data d = new Data();
	Data d1 = new Data();
	Data d2 = new Data();
	
	d.setRollno(101);
    d1.setRollno(102);
    d2.setRollno(103);
     
   
     
     List<Data> mylist = new ArrayList<Data>();
     
     //d.setStudentname("arun");
     //d1.setStudentname("Bob");
     //d2.setStudentname("Cathy");
     
     //Set<Data> myset = new TreeSet<Data>();
     
     //Set <Data> mynewset = new TreeSet<Data>();
      //mynewset.add(d1);
    
     mylist.add(d1);
     mylist.add(d);
     mylist.add(d2);
     
     //myset.add(d);
     //myset.add(d1);
     //myset.add(d2);
     //System.out.println(""+myset);
   //  Iterator<Data> itr = myset.iterator();
     
     //System.out.println(" Elements before sorting: " + myset);
     //System.out.println("" +mynewset);
     
     System.out.println(" Elements before sorting: " + mylist.get(0)+","+ mylist.get(1)+","+ mylist.get(2));
     Collections.sort(mylist);
     System.out.println(" Elements After sorting: " + mylist.get(0)+","+ mylist.get(1)+","+ mylist.get(2));
     
     
     
}
} 