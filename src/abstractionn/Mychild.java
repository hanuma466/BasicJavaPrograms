package abstractionn;

public class Mychild extends AbstractClass {
	
	public Mychild() {
		System.out.println("child object created");
	}
	
	public int highest() {
		return 3;
	}
	public int lowest() {
		return 2;
	}
	public static void main(String[] args) {
		AbstractClass ch=new Mychild();
		 System.out.println(ch.lowest());
		 
		 
		System.out.println(ch.add_member());
	}

	@Override
	public int add_member() {
		
		return 0;
	}

}
