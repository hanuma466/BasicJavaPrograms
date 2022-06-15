package abstractionn;

public class Mychild2 extends Mychild {
	public Mychild2() {
		System.out.println("mychild2 constructor called");
	}
	public int highest() {
		return 3;
	}
	public int lowest() {
		return 2;
	}
	public int lowest2() {
		return 2;
	}
	public static void main(String[] args) {
		Myinterface mychild2= new Mychild2();
		mychild2.highest();
		mychild2.lowest();
		System.out.println("--------------------------------");
		
	}

}
