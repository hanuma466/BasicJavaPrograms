package Basics;

public class Conversions {
	public static void main(String[] args) {
		String a="123";
		//convert string into integer
		Integer i=Integer.parseInt(a);
		System.out.println(i);
		
		//string to float
		String f="123.24";
		Float ft=Float.parseFloat(f);
		System.out.println(ft);
		
		//convert char array to string
		char[]  name= {'h','a','n','u','m','a'};
		String s=new String(name);
		System.out.println(s);
		
		//convert string to chars
		 name=s.toCharArray();
		System.out.println(name);
		
		
		//convert integer to string
		
		a=String.valueOf(i);
		System.out.println(a);
		
		
		
	}

}
