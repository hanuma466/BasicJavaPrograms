package Strings;

public class IsStringImmutable {

	public IsStringImmutable() {
		System.out.println("yes string is immutable.Once we declare we can't change the data in string constant pool");
	}
	public static void main(String[] args) {
		String s="test";
		s="hello";
		System.out.println(s);
	}
}
