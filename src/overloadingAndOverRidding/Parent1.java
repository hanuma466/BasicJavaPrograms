package overloadingAndOverRidding;

public class Parent1 {
	
	public Parent1() {
		System.out.println("parent objected");
	}
	public void test1() {
		System.out.println("parent method test1");
	}
	public void test2() {
		System.out.println("parent method test2");
	}
	public void test1(int i) {
		System.out.println("overloading method called.."+i);
	}

}
