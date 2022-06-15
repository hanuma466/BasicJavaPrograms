package Basics;



public class Pyramid {
	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			for (int j = i; j < 5; j++) {
				System.out.print("X ");
			}
			System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		int k = 0;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(++k + " ");
			}
			System.out.println();
		}
		k = 0;
		for (int i = 0; i < 10; i++) {
			for (int k1 = 0; k1 < (10 - i) / 2; k1++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i; j++) {
				System.out.print(++k + " ");
			}
			System.out.println();
		}

	}
}
