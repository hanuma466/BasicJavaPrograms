package myPractice;

import java.util.HashMap;
import java.util.Map;

public class HighestValueInMap {

	public static void main(String[] args) {
		Map<String, Integer> s = new HashMap<String, Integer>();
		s.put("test1", 7);
		s.put("test5", 3);
		s.put("test2", 1);
		s.put("test8", 9);
		s.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		s.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		
		System.out.println("..............");
		System.out.println(s.values().stream().max(Integer::compare).get());
		System.out.println(s.values().stream().min(Integer::compare).get());
		
		
	}

}
