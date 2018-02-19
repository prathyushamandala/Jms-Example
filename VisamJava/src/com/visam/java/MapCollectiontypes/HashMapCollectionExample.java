package com.visam.java.MapCollectiontypes;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapCollectionExample {

	public static void main(String args[]) {
		HashMap<String, String> hm = new HashMap<String, String>();

		hm.put("arun", "KITS");
		hm.put("dany", "SR");
		hm.put("carol", "BITS");
		Collections.synchronizedMap(hm); // if we take String the insertion order is not maintained.But for Integer the insertion order is maintained

		System.out.println("" + hm);
		

		// Iterate on entire set ,hashmap
		for (Map.Entry m : hm.entrySet()) {

			System.out.println("" + m);
		}

		// Iterate on only key , give the type of the key: string ,hashmap
		for (String m1 : hm.keySet()) {
			System.out.println("" + m1);
		}

		// Iterate on value, give the type of the value : string or can be int
		for (String m2 : hm.values()) {
			System.out.println("" + m2);
		}

		// using Iterator
		Iterator itr = hm.entrySet().iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
