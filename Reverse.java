package abc;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = ab.nextInt();
		int rev = Reverse(a);
		System.out.println("Reverse of number is : "+rev);

	}

	private static int Reverse(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum = sum * 10 + rem;
			n = n / 10;
		}
		return sum;

	}
}