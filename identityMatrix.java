package abc;

import java.util.Scanner;

public class identityMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int num = sc.nextInt();
		matrix(num);
	}

	private static void matrix(int num) {
		int arr[][] = new int[num][num];
		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (i == j) {
					arr[i][j] = 1;
				} else {
					arr[i][j] = 0;
				}
			}
		}
		for (int m = 0; m < num; m++) {
			for (int n = 0; n < num; n++) {
				System.out.print(arr[m][n] + " ");
			}
			System.out.println();
		}
	}
}
