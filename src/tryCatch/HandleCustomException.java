package tryCatch;

public class HandleCustomException {
	
	public HandleCustomException() {
		System.out.println("HandleCustomException");
	}
	
	public static void main(String[] args) throws Exception {
		try {
			throw new CustomException("user defined exception.");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
