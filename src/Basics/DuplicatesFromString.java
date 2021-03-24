package Basics;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicatesFromString {
	public static void main(String[] args) {
		String s = "veera venkata hanuman";
		Map<Character, Integer> k = new LinkedHashMap<Character, Integer>();
		for (Character c : s.toCharArray()) {
			if (k.containsKey(c)) {
				if(k.get(c)==1) {
					System.out.print(c);
					k.put(c, 2);
				}
			}
			else {
				k.put(c, 1);
			}
		}
	}

}
