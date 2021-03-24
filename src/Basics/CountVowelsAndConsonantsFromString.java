package Basics;

public class CountVowelsAndConsonantsFromString {
	public static void main(String[] args) {

		String st = "abcabcaaaa";
		int v = 0;
		int ct = 0;
		char[] voi = { 'a', 'e', 'i', 'o', 'u' };
		d: for (char c : st.toCharArray()) {
			for (char t : voi) {
				if (t == c) {
					v++;
					continue d;
				}
			}
			ct++;
		}

		System.out.println("vowels " + v + " const " + ct);
		

	
	}
}
