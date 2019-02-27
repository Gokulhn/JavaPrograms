package abc;

import java.util.Arrays;
import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the number of elements in array :");
		int n = a.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the array elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = a.nextInt();
		}
		System.out.println("Elements in array is :");
		System.out.println(Arrays.toString(arr));
		int ab[] = bubbleSort(arr, n);
		System.out.println("Elements after sorting is :");
		System.out.println(Arrays.toString(ab));
		System.out.println("--------------------------");
		System.out.println("least Element in array is " + ab[0]);
		System.out.println("Max element in array is " + ab[n - 1]);
		System.out.println("--------------------------");
		System.out.println("Second highest element in given array is :" + ab[n - 2]);
	}

	public static int[] bubbleSort(int[] arr, int n) {
		int swap ;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					swap = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = swap;
				}
			}
		}
		return arr;
	}
}
