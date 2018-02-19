package com.visam.java.MapCollectiontypes;


import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrenthashmapExample {
	public static void main(String args[]) {
		

		ConcurrentHashMap<Integer,String> chm =new ConcurrentHashMap<Integer,String>();
		
		chm.put(260, "abc");
		chm.put(263, "xyz");
		chm.put(266,"pqr");
		// Iterate over concurrent hash map
				Iterator itr1 = chm.entrySet().iterator();
				while (itr1.hasNext()) {
					{
						chm.put( 280, "lll");  //concurrent hash map doesn't throw exception when modify values at run time
					}
					System.out.println(itr1.next()); // the insertion order is maintained in concurrent hashmap
				}


}
}
