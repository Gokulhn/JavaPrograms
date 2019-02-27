package abc;

import java.util.Scanner;

public class CountofVowels {
	static String vowel = "aeiou";

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("Enter the string :");
		String data = a.next().toLowerCase();
		checkString(data);

	}

	private static void checkString(String data) {
		int vow = 0;
		int l = data.length();
		for (int i = 0; i < l; i++) {
			for (int j = 0; j < vowel.length(); j++)
				if (data.charAt(i) == vowel.charAt(j)) {
					vow++;
				}
		}
		int consont=data.length()-vow;
		System.out.println("Number of vowels in a given string is :"+vow);
		System.out.println("Number of consonant in a given String is :"+consont);
	}
}
