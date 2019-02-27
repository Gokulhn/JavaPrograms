package abc;
//sum of series 1+1/2+1/3+1/4+........1/n

import java.util.Scanner;

public class sumOfSeries {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = ab.nextInt();
		float sum = sumOfSeries(a);
		System.out.println("Sum of series is = "+sum);

	}

	private static float sumOfSeries(int a) {
		float s = 0;
		for (int i = 1; i <= a; i++) {
			s = s + (float) 1 / i;
		}
		return s;
	}
}
