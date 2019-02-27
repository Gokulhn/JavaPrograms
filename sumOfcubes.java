package abc;

import java.util.Scanner;

public class sumOfcubes {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = ab.nextInt();
		double sum = sumOfSeries(a);
		System.out.println("Sum of series is = " + sum);

	}

	private static double sumOfSeries(int a) {
		double s = 0;
		for (int i = 1; i <= a; i++) {
			s = s + (double) 1 / (i * i * i);
		}
		return s;
	}

}
