package abc;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOperation {
	static Scanner ab = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("-------------WELCOME-----------");
		System.out.println("Enter the number of array elements :");
		int n = ab.nextInt();
		int[] arr = inputArray(n);
		System.out.println("Displaying the elements :");
		System.out.println(Arrays.toString(arr));
		System.out.println("---------------------");
		System.out.println("Finding maximum element in array :");
		int max = maximumElement(arr);
		System.out.println("Max element is :" + max);
		System.out.println("---------------------");
		System.out.println("Finding minimum element in array :");
		int min=minimumElement(arr);
		System.out.println("Min element is :" + min);
		System.out.println("---------------------");

	}

	public static int minimumElement(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		return min;
	}

	public static int maximumElement(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

	public static int[] inputArray(int n) {
		int arr[] = new int[n];
		System.out.println("Enter the array elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = ab.nextInt();
		}
		return arr;
	}
}
