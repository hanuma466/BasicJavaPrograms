package Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectionsmani {

	public static void main(String[] args) {
		
		//facibincai series
		int j=0;
		int k=1;
		int temp=0;
		System.out.print(j);
		for(int i=0;i<10;i++) {
			temp=j+k;
			System.out.print(temp +" ");
			k=j;
			j=temp;
		}
		
		
		
		List<Integer>s=new ArrayList<Integer>();
		s.add(1);
		s.add(0);
		s.add(5);
		s.add(7);
		s.add(6);
		s.add(1);
		s.add(7);
		s.add(8);
		s.add(1);
		System.out.println();
		System.out.println(s);
		//removing duplicates from list and converting list to set
		Set<Integer>tg =new LinkedHashSet<Integer>(s);
		List<Integer>td=new ArrayList<>(tg);
		System.out.println(td);
		//maintaining the sorting order
		Set<Integer>tt=new TreeSet<Integer>(s);
		System.out.println(tg);
		System.out.println("...........................");
		System.out.println("sorted ..."+tt);
		System.out.println("------------------------------------");
		//transversing the elements using iterator
		Iterator<Integer>itr=tg.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		System.out.println("///////////////////////////");
		//transversing the elements using Listiterator
		ListIterator<Integer>ls=s.listIterator();
		while(ls.hasNext()) {
			System.out.print(ls.next());
		}
		
		System.out.println();
		System.out.println(",,,,,,,,,,,,,");
		//iterating using for each loop
		for(Integer t:s) {
			System.out.print(t);
		}
		System.out.println();
		System.out.println("............................");
		for(int g:tt) {
			System.out.print(g);
		}
		System.out.println();
		System.out.println(";;;;;;;;;;;;");
		String sk="test232874hAN45445uMA";
		System.out.println(sk.replaceAll("[A-Z]", ""));
		sk=sk.replaceAll("[a-zA-Z]", "");
		
		Pattern p=Pattern.compile("[0-9]{10}");
		System.out.println(p.matcher("8985006866").matches());
		
		Random r=new Random();
		System.out.println("random value...."+r.ints(0, 10));
		System.out.println(Math.random());
		
		Integer[] dh= {1,2,3,1,5,0,5,9};
		
		
		//converting array to list
		List<Integer>sh=Arrays.asList(dh);
		//sorting the array
		Arrays.sort(dh);
		
		for(Integer ghs:sh) {
			System.out.print(ghs);
		}
		
		System.out.println();
		s.stream(                                                                                                                             ).sorted().forEach(a->System.out.print(a));
		System.out.println();
		System.out.println("[[[[[[[[[[[[[[[[[[[[[[[[[[[");
		System.out.println(s.stream().filter(a->a%2==0).collect(Collectors.toList()));
		
		
		
		
		
		System.out.println(s);
		System.out.println();
		System.out.println("......");
		tg.stream().sorted().forEach(a->System.out.print(a));
		
		Stream<Integer>sii=Arrays.stream(dh);
		System.out.println();
		sii.forEach(a->System.out.print(a));
		
		Arrays.stream(dh).forEach(a->System.out.print(a));
		
		
		
		
	}
	



}
