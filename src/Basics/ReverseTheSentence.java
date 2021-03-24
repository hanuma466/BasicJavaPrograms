package Basics;

public class ReverseTheSentence {
	public static void main(String[] args) {
		String employee_intro = "my name is hanuma";
		StringBuffer reverse_employee_intro = new StringBuffer();
		for (String word : employee_intro.split(" ")) {
			reverse_employee_intro.append(new StringBuffer(word).reverse() + " ");
		}
		System.out.println(reverse_employee_intro);

	}

}
