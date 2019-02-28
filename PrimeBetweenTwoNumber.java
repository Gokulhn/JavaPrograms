package abc;

import java.util.Scanner;

public class PrimeBetweenTwoNumber {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the Lower bound :");
		int lb = ab.nextInt();
		System.out.println("Enter the upper bound :");
		int ub = ab.nextInt();
		int a = countPrime(lb, ub);
		System.out.println("Count of Prime numbers in given range is :"+a);
	}

	public static int countPrime(int lb, int ub) {
		int count = 0;
		while (lb < ub) {
			if (isPrime(lb)) {
				System.out.println("Prime number :"+lb);
				count++;
			}
			lb++;
		}
		return count;
	}

	private static boolean isPrime(int lb) {
		if (lb < 2) {
			return false;
		} else {
			for (int i = 2; i <= Math.sqrt(lb); i++) {
				if (lb % i == 0) {
					return false;
				}
			}
		}
		return true;
	}
}