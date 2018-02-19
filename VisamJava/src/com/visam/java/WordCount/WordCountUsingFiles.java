package com.visam.java.WordCount;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class WordCountUsingFiles {
	public static void main(String args[]) {

		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("D:\\Test Java Files\\abc.txt"));
			String str = br.readLine();
			System.out.println(str);

			if (str != null || str.isEmpty()) {

				// print number of repeating words
				getWordCount(str);

				// print char repeating count
				getCharCount(str);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void getCharCount(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		char[] ch = str.toLowerCase().toCharArray();
		for (char c : ch) {
			if (map.containsKey(c)) {

				int count = map.get(c);// store the value in count for first time.
				// System.out.println(c);
				map.put(c, count + 1);
			} else {
				map.put(c, 1); // if it occurs for first time put the value as 1
			}

		}
		System.out.println("" + map);

	}

	private static void getWordCount(String str) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		String[] s1 = str.toLowerCase().split("\\s");
		for (String s2 : s1) {
			if (map.containsKey(s2)) {
				int count = map.get(s2);// store the value in count for first time.
				map.put(s2, count + 1); // increment by 1 if it occurs second time
			} else {
				map.put(s2, 1); // if it occurs for first time put the value as 1
			}

		}
		System.out.println("" + map);
	}

}
