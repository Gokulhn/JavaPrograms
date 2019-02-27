package abc;

import java.util.Scanner;

public class palindrome {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the String :");
		String data = ab.next();
		boolean a = isPalindrome(data);
		if (a) {
			System.out.println("Given String is palindrome :" + data);
		} else {
			System.out.println("Given String is not palindrome :" + data);
		}
		System.out.println("----------------------------");
		palin(data);
		System.out.println("----------------------------");

	}

	public static boolean isPalindrome(String ab) {
		return new StringBuffer(ab).reverse().toString().equals(ab);
	}

	public static void palin(String ab) {
		int j = ab.length() - 1;
		int mid = ab.length() / 2;
		boolean a = true;
		for (int i = 0; i < mid; i++) {
			if (ab.charAt(i) != ab.charAt(j--)) {
				System.out.println(" it is not a palindrome ");
				a = false;
				break;
			}
		}
		if (a) {
			System.out.println("it is palindrome ");
		}

	}
	
}
