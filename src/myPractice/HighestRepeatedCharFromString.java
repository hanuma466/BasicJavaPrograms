package myPractice;

import java.util.HashMap;

public class HighestRepeatedCharFromString {
	public static void main(String[] args) {
		String s = "abcabcccaaaabbbaaaa";
		HashMap<Character, Integer> t = new HashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			if (t.containsKey(c)) {
				int cou = t.get(c);
				t.put(c, ++cou);
			} else {
				t.put(c, 1);
			}
		}
		System.out.println(t);

		int temp = 0;
		char ch = 'a';
		for (Character c : t.keySet()) {
			if (temp < t.get(c)) {
				temp = t.get(c);
				ch = c;
			}
		}
		System.out.println("highest repeted char " + ch + " count " + temp);
	
	}

}
