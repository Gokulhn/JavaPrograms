package abc;

import java.util.Arrays;
import java.util.Scanner;

public class NmberOfPalinInString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String input = sc.nextLine();
		String arr[] = input.split(" ");
		System.out.println("String elements are :");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("------------------");
		checkPalindrome(arr);
	}

	private static void checkPalindrome(String[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (palindrome.isPalindrome(arr[i])) {
				count++;
			} else {
				continue;
			}
		}
		System.out.println("Count of number of palindrome in a string is :" + count);
	}
}
