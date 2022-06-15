package myPractice;

public class ConvertEachCharToCamelCase {
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
		//convert(s);
		System.out.println(s.length());
		System.out.println(s.trim().length());
		
		
		}
	
	public static void convert(String s) {
		String[] st=s.split(" ");
		StringBuffer sb=new StringBuffer();
		for(String t:st) {
			String temp=t.trim();
			//System.out.print(temp+" ");
			if(temp.isEmpty()) {	
				continue;
			}
			else
				sb.append(temp.substring(0, 1).toUpperCase()+temp.substring(1,temp.length())+" ");
		}
		System.out.println(sb);
	}
}
