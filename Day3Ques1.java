package abc;

import java.util.Scanner;

public class Day3Ques1 {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("----------WELCOME----------");
		while (true) {
			System.out.println("----------------------------------");
		System.out.println("1. Palindrome of number " + "\n" + "2. GCD of number " + "\n" + "3. Factorial of number");
		System.out.println("---------------------");
		System.out.println("Enter your choice :");
			int choice = ab.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the number :");
				int num = ab.nextInt();
				boolean rev = palin(num);
				System.out.println("Given number palindrome status :" + rev);
				break;

			case 2:
				System.out.println("Enter the number to calculate GCD of 2 numbers :");
				int a = ab.nextInt();
				int b = ab.nextInt();
				int gcd = gcd(a, b);
				System.out.println("GCD of 2 numbers is :" + gcd);
				break;

			case 3:
				System.out.println("Enter the number to get factorial :");
				int n = ab.nextInt();
				int fact = fact(n);
				System.out.println("Factorial of given number is :" + fact);
				break;

			default:
				System.out.println("Go to hell!!!");
				break;
			}
		}
	}

	public static int fact(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	private static int gcd(int a, int b) {
		if (b != 0) {
			return gcd(b, a % b);
		} else {
			return a;
		}
	}

	public static boolean palin(int num) {
		int sum = 0;
		int n = num;
		while (num != 0) {
			int a = num % 10;
			sum = sum * 10 + a;
			num /= 10;
		}
		if (n == sum) {
			return true;
		} else {
			return false;
		}
	}
}