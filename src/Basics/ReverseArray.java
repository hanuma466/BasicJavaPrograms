package Basics;

import java.util.HashMap;
import java.util.Map;

public class ReverseArray {

public static void main(String[] args) {
	 int[] t= {1,4,6,3,5,6};
	 int[] reverse=new int[t.length];
	 int k=0;
	 for(int i=t.length-1;i>=0;i--) {
		 reverse[k]=t[i];
		 k++;
		 System.out.print(t[i]);
		 
	 }	
	
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
