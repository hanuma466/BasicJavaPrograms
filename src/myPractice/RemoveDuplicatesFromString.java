package myPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {


	public static void main(String[] args) {
		String s = "veera";
		Set<String> ch = new LinkedHashSet<String>(Arrays.asList(s.split("")));
		System.out.println(ch);
	}
	
	



}
