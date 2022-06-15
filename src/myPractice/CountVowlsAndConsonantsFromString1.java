package myPractice;

public class CountVowlsAndConsonantsFromString1 {
	public static void main(String[] args) {

		String s = "abcabcaaaa";
		int v = 0;
		int ch = 0;
		char[] Voi = { 'a', 'e', 'i', 'o', 'u' };
		d: for (char c : s.toCharArray()) {
			for (char t : Voi) {
				if (t == c) {
					v++;
					continue d;
				}}
			}
			ch++;
		System.out.println("vowels " + v + " const " + ch);
		

	
	}
}

	
				
		
			
	


