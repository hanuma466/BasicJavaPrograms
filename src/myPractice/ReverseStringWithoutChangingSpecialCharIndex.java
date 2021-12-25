package myPractice;

public class ReverseStringWithoutChangingSpecialCharIndex {

	
	public static void main(String[] args) {
		String s="te#st@ing";
		way2(s);
		way1(s);
	}
	public static void way1(String s) {
		char[] c=new StringBuffer(s.replaceAll("[^a-zA-Z]", "")).reverse().toString().toCharArray();
		String g=s.replaceAll("[a-zA-z]", " ");
		StringBuffer b=new StringBuffer();
		int k=0;
		for(int i=0;i<s.length();i++) {
			if(g.charAt(i)!=' ') {
				b.append(g.charAt(i));
			}else {
				b.append(c[k]);
				k++;
			}
		}
		System.out.println(b);
	}
	public static void way2(String a) {
		char c[]=a.toCharArray();
		char temp=' ';
		int max=a.length()-1;
		int min=0;
		while(min!=max) {
			//System.out.println("min " +min+ " max "+max);
			
			if(Character.isAlphabetic(c[min])&&Character.isAlphabetic(c[max])) {
				temp=c[max];
				c[max]=c[min];
				c[min]=temp;
				min++;
				max--;
			}
			else if(!Character.isAlphabetic(c[max])){
				max--;
				
			}else {
				min++;
			}
			//System.out.println(c);	
			//System.out.println(".........................");
			
		}
		System.out.println(c);
	}


}
