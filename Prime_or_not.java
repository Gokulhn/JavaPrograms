package abc;

import java.util.Scanner;

public class Prime_or_not {
	public static void main(String[] args) {

		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the number to check prime or not :");
		int a = ab.nextInt();
		isPrime(a);

	}

	private static void isPrime(int a) {
		if (a < 2) {
			System.out.println("Entered number is not a prime number!!!1");
		} else {
			for (int i = 2; i <= Math.sqrt(a); i++) {
				if (a % i == 0) {
					System.out.println("Number is not prime!!!!");
				}
			}
		}
	}
}
