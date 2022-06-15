package myPractice;

public class ConvertEachCharToCamelCase1 {

	public static void main(String[] args) {
		String s = "This     is     a     sample       test    ";
		System.out.println(s.trim());
		System.out.println();
		String temp = "";
		int i = 0;
		for (char c : s.toCharArray()) {
			if (c != ' ') {
				if (i != 0)
					temp = temp + " "+Character.toUpperCase(c);
				else
					temp = temp + c;
				i = 0;
			}
			if (c == ' ') {
				i++;
			}

		}
		System.out.println(temp);

	}

}
