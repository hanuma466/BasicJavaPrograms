package overloadingAndOverRidding;

public class Child1 extends Parent1 {
	
	public Child1() {
		System.out.println("child object created...");
	}
	
	public static void main(String[] args) {
		
		  Child1 c=new Child1();
		  c.test1();
		  c.test2();
		  c.test3();
		  c.test1(7);
		  System.out.println(".........................");
		  Parent1 p=new Parent1();
		  p.test1(); 
		  System.out.println("------------------------");
		 
		Parent1 cp=new Child1();
		cp.test1();
		cp.test2();
	}
	public void test1() {
		System.out.println("child method executed");
	}
	public void test3() {
		System.out.println("child method");
	}
}
