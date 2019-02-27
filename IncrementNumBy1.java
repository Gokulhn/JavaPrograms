package abc;

import java.util.Scanner;

public class IncrementNumBy1 {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = ab.nextInt();
		int b = reverseOf(a);
		int c = add(b);
		System.out.println("The final num is : " + c);

	}

	private static int add(int b) {
		int sum = 0;
		while (b != 0) {
			int rem = b % 10;
			if (rem == 9) {
				sum = sum * 10;
				b = b / 10;
			} else {
				sum = sum * 10 + (rem + 1);
				b = b / 10;
			}
		}
		return sum;
	}

	private static int reverseOf(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		return sum;

	}
}
