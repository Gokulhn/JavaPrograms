package abc;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingPrograms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the array elements :");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Elements of array :" + Arrays.toString(arr));
		System.out.println("-------------------------");
		while (true) {
			System.out.println("1. Linear Search" + "\n" + "2. Binary Search");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("--------LINEAR SEARCH------------");
				System.out.println("Enter the Key element to search :");
				int search = sc.nextInt();
				boolean a = linearSearch(arr, search, n);
				System.out.println("Elements found is :" + a);
				System.out.println("----------------");
				break;

			case 2:
				System.out.println("----------BINARY SEARCH-------");
				int newarr1[] = SecondHighest.bubbleSort(arr, n);
				System.out.println("Elements in arr are : " + Arrays.toString(arr));
				System.out.println("Enter the Key element to search :");
				int search1 = sc.nextInt();
				boolean a1 = binarySearch(arr, search1);
				System.out.println("Elements found is :" + a1);
				System.out.println("----------------------");
				break;
			default:
				System.out.println("Sorry no option available!!!!");
				break;
			}
		}
	}

	public static boolean linearSearch(int[] arr, int key, int n) {
		for (int a = 0; a < n; a++) {
			if (arr[a] == key) {
				return true;
			}
		}
		return false;
	}

	public static boolean binarySearch(int[] arr, int key) {
		int n = arr.length;
		int first = 0;
		int last = n - 1;
		int mid = (first + last) / 2;

		while (first <= last) {
			if (arr[mid] < key) {
				first = mid + 1;
			} else if (arr[mid] == key) {
				System.out.println("Element found sucessful!!!");
				return true;
			} else {
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		return false;

	}

}
