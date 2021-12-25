package Basics;

public class Stringreverse {
	public static void main(String[] args) {
		String s = "873582432374";
		String rever = "";
		for (char c : s.toCharArray()) {
			rever = c + rever;
		}
		System.out.println(rever);

		StringBuffer b = new StringBuffer();
		for (int i = s.length() - 1; i >= 0; i--) {
			b.append(s.charAt(i));
		}
		System.out.println(b);
		String temp="";
		System.out.println("");
		s.chars().distinct().forEach(a->System.out.print((char)a));
		System.out.println();
		s.chars().sorted().forEach(a->System.out.print((char)a));
		
		String k="hanuma";
		k.chars().distinct().sorted().forEach(a->System.out.println((char)a));
		
	}
}
