package myPractice;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SecondhighestRepetedChar {

	public static void main(String[] args) {
		String s = "Selenium is used for automation testing ";
		s = s.replaceAll(" ", "");
		System.out.println(s);
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		for (char c : s.toCharArray()) {
			if (m.containsKey(c)) {
				m.put(c, m.get(c) + 1);
			} else {
				m.put(c, 1);
			}
		}
		System.out.println(m);
		
		Set<Integer> set=new TreeSet<Integer>(m.values());
		int i=new LinkedList<Integer>(set).get(set.size()-2);
		for(Character c:m.keySet()) {
			if(m.get(c)==i) {
				System.out.println(c+"   "+i);
			}
		}

	}

}
