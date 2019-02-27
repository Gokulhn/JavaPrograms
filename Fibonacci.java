package abc;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = ab.nextInt();
		Fibonacci(a);
	}

	private static void Fibonacci(int a) {
		int f = 0, s = 1, sum = 0;
		for (int i = 1; i <=a; i++) {
			System.out.print(f+",");
			sum = f + s;
			f = s;
			s = sum;
		}
	}
}
