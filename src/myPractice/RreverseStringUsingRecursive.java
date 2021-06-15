package myPractice;

public class RreverseStringUsingRecursive {
	public static void main(String[] args) {
		String s="selenium";
		String o="";
		o=RreverseStringUsingRecursive.reverse(s, o, s.length()-1);
		System.out.println(o);
		
	}
	public static String  reverse(String input,String output,int length) {
		if(length>=0)
		return reverse(input,output+input.charAt(length),length-1);
		return output;
		
		
	}

}
