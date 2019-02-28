package abc;

import java.util.Arrays;
import java.util.Random;
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
		int min = minimumElement(arr);
		System.out.println("Min element is :" + min);
		System.out.println("---------------------");
		System.out.println("Sum of the array elements :");
		int sum = sumOfArray(arr);
		System.out.println("Sum is :" + sum);
		System.out.println("---------------------");
		System.out.println("Average ");
		int aver = sum / arr.length;
		System.out.println("Average of array elements is :" + aver);
		System.out.println("---------------------");
		System.out.println("Searching ");
		System.out.println("Enter the number to search in array :");
		int key = ab.nextInt();
		boolean a = SearchingPrograms.binarySearch(arr, key);
		System.out.println("Searched element status :" + a);
		System.out.println("---------------------");
		System.out.println("Reversing ");
		reverseArray(arr, n);
		System.out.println("---------------------");
		System.out.println("Shuffling ");
		shuffleArray(arr);
		System.out.println("-----------END----------");

	}

	public static void shuffleArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
		Random rnd= new Random();
		for(int i=arr.length-1;i>0;i--) {
			int ind=rnd.nextInt(i+1);
			int temp=arr[i];
			arr[i]=arr[ind];
			arr[ind]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void reverseArray(int[] arr, int n) {
		int[] rev = new int[n];
		int len =n-1;
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			rev[len--] = arr[i];
		}
		System.out.println("Reversed array is :");
		System.out.println(Arrays.toString(rev));
	}

	public static int sumOfArray(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
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
