package tryCatch;

public class TryCatchWithReturn {
	
	public static void main(String[] args) {
		System.out.println(test());
	}
	public static int test() {
		try {
			System.out.println("try executed...");
			return 6;
		}catch(Exception e) {
			System.out.println("catch block executed..");
		}
		return 2;
	}

}
