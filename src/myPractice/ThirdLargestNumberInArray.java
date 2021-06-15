package myPractice;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThirdLargestNumberInArray {
	public static void main(String[] args) {
		int[] a= {1,5,2,3,7,7,8,0,6};
		way1(a);
		way2(a);
		
	}
	public static void way1(int[] a) {
		Set<Integer>set=new TreeSet<Integer>();
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		List<Integer>list=new LinkedList<Integer>(set);
		System.out.println(list);
		System.out.println("third largest number is..."+list.get((list.size()-3)));
	}
	
	public static void way2(int[] a) {
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int  j=i;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		int highest=a[a.length-1];
		System.out.println(highest);
		int third_highest=0;
		int count=0;
		for(int i=a.length-1;i>0;i--) {
			if(highest>a[i]) {
				count++;
			}
			if(count==3) {
				third_highest=a[i];
				break;
			}
		}
		System.out.println("third highest number.."+third_highest);
		
	}
	

}
