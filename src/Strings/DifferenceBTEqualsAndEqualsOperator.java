package Strings;

public class DifferenceBTEqualsAndEqualsOperator {
	
	public DifferenceBTEqualsAndEqualsOperator() {
		System.out.println("equals operator  check reference object and Equals method checks the  content of method");;
	}
	public static void main(String[] args) {
		String s="test";
		String g="test";
		String h=new String("test");
		String k=new String("test");
		System.out.println(s==g);
		System.out.println(g==h);
		System.out.println(h==k);
		System.out.println(s.equals(g));
		System.out.println(s.equals(h));
		System.out.println(k.equals(h));
		
	}

}
