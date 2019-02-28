package abc;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int num = sc.nextInt();
		int s = sum(num);
		System.out.println("Reversed num is  :" + s);
	}

	private static int sum(int num) {
		int sum = 0;
		while (num != 0) {
			int a = num % 10;
			sum = sum * 10 + a;
			num /= 10;
		}
		return rev(sum);
	}

	public static int rev(int sum) {
		int d = 0;
		while (sum != 0) {
			int b = sum % 10;
			if (b == 9) {
				d = d * 10;
				sum /= 10;
			} else {
				d = d * 10 + (b + 1);
				sum /= 10;
			}
		}
		return d;
	}
}
