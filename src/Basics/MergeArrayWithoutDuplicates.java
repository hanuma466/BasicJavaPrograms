package Basics;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MergeArrayWithoutDuplicates {
	public static void main(String[] args) {

		Integer[] array1 = { 1, 3, 2, 4, 2 };
		Integer[] array2 = { 3, 2, 6, 8 };
		Set<Integer> set_array1 = new HashSet<Integer>(Arrays.asList(array1));
		set_array1.addAll(new HashSet<Integer>(Arrays.asList(array2)));
		System.out.println(set_array1);

	}
}
