package inheritance;

public class Child extends Base {
	
	public Child() {
		System.out.println("child constructor is called");
	}

	public void num() {
		System.out.println("num method called in child");
	}
	public static void main(String[] args) {
		Child child=new Child() ;
		child.num();
		System.out.println(".............................");
		Base base=new Base();
		base.num();
		System.out.println("-------------------------");
		Base childbase=new Child();
		childbase.num();
		
/*		parent type object can't be assiged to child reference
		Child chil=new Base();
		*/
		
	}
	
}
