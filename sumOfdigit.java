package abc;

import java.util.Scanner;

public class sumOfdigit {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the number to get the sum of digit:");
		int a = ab.nextInt();
		int aa = Sum(a);
		System.out.println("sum of digit is = " + aa);
	}

	private static int Sum(int n) {
		int sum = 0;
		while (n != 0) {
			int rem = n % 10;
			sum += rem;
			n = n / 10;
		}
		return sum;
	}
}
