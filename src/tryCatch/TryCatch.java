package tryCatch;

public class TryCatch {
	public static void main(String[] args) {
		
		try {
			int i=0;
			int j=5;
			System.out.println(j/i);
		}catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getClass());
		}
		
	}

}
