package Basics;

import java.util.HashMap;
import java.util.Map;

public class CountRepetedWordsMoreThanOne {
public static void main(String[] args) {
	 String s="india is my country. india butiful having many butiful places butiful";
	 Stringman(s);
}

public static void Stringman(String s) {
	System.out.println();
	Map<String,Integer>k=new HashMap<String,Integer>();
	for(String f:s.split(" ")) {
		if(k.containsKey(f.trim())) {
			k.put(f, k.get(f)+1);
		}else {
			k.put(f,1);
		}
	}
	for(String f:k.keySet()) {
		if(k.get(f)>1) {
			System.out.println(f+"=="+k.get(f));
		}
	}

}

}
