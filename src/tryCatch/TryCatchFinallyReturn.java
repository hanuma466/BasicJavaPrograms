package tryCatch;

public class TryCatchFinallyReturn {
public static void main(String[] args) {
	System.out.println(test());
}
public static int test() {
	try {
		System.out.println("try exxecuted...");
		return 5/0;
	}catch(Exception e){
		System.out.println("catch executed...");
		return 7;
		
	}finally {
		System.out.println("finally executed..");
		return 9;
	}
}
}
