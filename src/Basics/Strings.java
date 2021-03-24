package Basics;

public class Strings {
	public static void main(String[] args) {
		String s="hanuma";
		String d="hanuma";
		String k=new String("hanuma");
		String g=new String("hanuma");
		System.out.println(" test s==d  "+s==d);
		System.out.println(" test  s==k  "+s==k);
		System.out.println("s.equalignorecase(d)    "+s.equalsIgnoreCase(d));
		System.out.println("k.equalignorecase(g)    "+g.equalsIgnoreCase(k));		
		System.out.println("s.equalignorecase(k)   "+s.equalsIgnoreCase(k));
	}

}
