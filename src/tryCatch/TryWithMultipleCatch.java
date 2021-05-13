package tryCatch;

public class TryWithMultipleCatch {
	public static void main(String[] args) {
		try {
			int i = 0;
			int j = 5;
			System.out.println(j / i);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getClass());
		} catch (ArrayStoreException e) {
			System.out.println("array store exception....");
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			System.out.println(e.getClass());
		} catch (Exception e) {
			System.out.println("execption class executed");
		} finally {
			System.out.println("finally block executed");
		}
	}

}
