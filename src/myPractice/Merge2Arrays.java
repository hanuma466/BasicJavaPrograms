package myPractice;

import java.util.Set;
import java.util.TreeSet;

public class Merge2Arrays {
	public static void main(String[] args) {
		int[] a = { 1, 5, 2, 5, 2, 0 };
		int[] b = { 4, 1, 8, 6, 3 };
		way1(a, b);
		way2(a, b);
	}

	private static void way2(int[] a, int[] b) {
		int[] temp = new int[a.length + b.length];
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < temp.length; j++) {

				if (a[i] == temp[j]) {
					break;
				} else if (temp.length - 1 == j) {
					temp[count] = a[i];
					count++;	
				}
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < temp.length; j++) {
				if (b[i] == temp[j]) {
					break;
				} else if (temp.length - 1 == j) {
					temp[count] = b[i];
					count++;
				}
			}
		}

		int temp1[] = new int[count + 1];
		for (int i = 0; i <= count; i++) {
			temp1[i] = temp[i];
			// System.out.println(temp[i]);
		}
		int h = 0;
		for (int i = 0; i < temp1.length; i++) {
			for (int j = i; j < temp1.length; j++) {
				if (temp1[i] > temp1[j]) {
					h = temp1[i];
					temp1[i] = temp1[j];
					temp1[j] = h;
				}
			}
		}
		for (int j : temp1) {
			System.out.println(j);
		}

	}

	private static void way1(int[] a, int[] b) {
		Set<Integer> s = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			s.add(a[i]);
		}
		for (int i = 0; i < b.length; i++) {
			s.add(b[i]);
		}
		System.out.println(s);

	}

}
