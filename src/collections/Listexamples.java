package collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Listexamples {
	
	public static void main(String[] args) {
		listComparision();
	}
	
	public static void listComparision() {
		String[] arr= {"test",new String("t"),"automation"};
		String[] arr1= {"test","t","automation"};
		List<String>li=new LinkedList<>(Arrays.asList(arr));
		List<String>li1=Arrays.asList(arr1);
		System.out.println(li.equals(li1));
		
		
	}

}
