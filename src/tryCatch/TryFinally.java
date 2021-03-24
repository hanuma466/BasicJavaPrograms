package tryCatch;

public class TryFinally {
	public static void main(String[] args) throws ArithmeticException{
		try {
			int i=0;
			int j=5;
			System.out.println(j/i);
		}finally {
			System.out.println("finally executed successfully");
		}
	}

}
