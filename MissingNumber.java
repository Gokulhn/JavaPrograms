package abc;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumber {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("----------MISSING ELEMENT----------");
		System.out.println("Enter the number of elements :");
		int len = ab.nextInt();
		int[] arr = new int[len];
		System.out.println("Enter the elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ab.nextInt();
		}
		System.out.println("Displayig the elements :");
		System.out.println(Arrays.toString(arr));
		 missingElement(arr);
	}

	public static void missingElement(int[] arr) {
		int len = arr.length;
		for (int j = 0; j < len-1; j++) {
			int prev = arr[j];
			int next = arr[j + 1];
			if (!(next == prev + 1)) {
				System.out.println("Missing elements is :" + (prev + 1));
			}
		}
	}
}
