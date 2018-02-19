package com.visam.java.WordCount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountUsingMap {
	public static void main(String args[]) {
	//	String str = "This is my first paragraph . split the First paragraph .";
		  // 1. Create a Scanner using the InputStream available.
	    Scanner scanner = new Scanner( System.in );

	    // 2. Don't forget to prompt the user
	    System.out.print( "Type some data for the program: " );

	    // 3. Use the Scanner to read a line of text from the user.
	    String str = scanner.nextLine();

	    // 4. Now, you can do anything with the input string that you need to.
	    // Like, output it to the user.
	    System.out.println( "input = " + str );
	    
	    
		String[] str1 = str.split("\\s");
		//System.out.println("Splitted Paragraph is : " + str1[0]);
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String s1 : str1) {
			String s2 =s1.toLowerCase();  // converts all characters in to lowercase before comparision
			if (map.containsKey(s2)) {
				int count = map.get(s2);//store the value in count for first time.
				map.put(s2, count + 1); // increment by 1 if it occurs second time
			} else {
				map.put(s2, 1); // if it occurs for first time put the value as 1
			}
			
		}

		System.out.println("" + map);

	}

}
