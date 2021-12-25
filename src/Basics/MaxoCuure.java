package Basics;

public class MaxoCuure {
	public static void main(String[] args) {
		String k="hanuma";
		k.chars().distinct().sorted().forEach(c->System.out.println(c));
		
		for(int i=0;i<k.length();i++) {
			String d="[^"+k.charAt(i)+"]";
			System.out.println(k.charAt(i)+".."+k.replaceAll(d, "").length());
		}
	}

}
