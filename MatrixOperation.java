package abc;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixOperation {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("-------------MATRIX OPERATION-------------");
		System.out.println("Enter the number of rows :");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns :");
		int col = sc.nextInt();
		System.out.println("---------------------");
		System.out.println("Enter the array elements : ");
		int arr[][] = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("------------------------");
		System.out.println("Displaying the element of array :");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("------------------------");
		System.out.println("Maximum elements in array ");
		int[] arr2 = singleArray(arr, row, col);
		int max = ArrayOperation.maximumElement(arr2);
		System.out.println(max);
		System.out.println("------------------------");

		System.out.println("Minimum elements in array ");
		int[] arr3 = singleArray(arr, row, col);
		int minele = ArrayOperation.minimumElement(arr3);
		System.out.println(minele);
		System.out.println("------------------------");

		System.out.println("Finding the MAX row elements :");
		int maxR[] = maxRow(arr, row, col);
		System.out.println(Arrays.toString(maxR));
		System.out.println("------------------------");

		System.out.println("Finding the MIN row elements :");
		int min[] = minRow(arr, row, col);
		System.out.println(Arrays.toString(min));
		System.out.println("------------------------");
		
		System.out.println("Finding the MAX row elements :");
		int maxC[] = maxCol(arr, row, col);
		System.out.println(Arrays.toString(maxC));
		System.out.println("------------------------");
		
		System.out.println("Finding the MIN col elements :");
		int minC[]=minCol(arr, row, col);
		System.out.println(Arrays.toString(minC));
		System.out.println("------------------------");
		
		

	}

	public static int[] maxCol(int[][] arr, int m, int n) {
		int col[] = new int[n];
		int max[] = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				col[j] = arr[j][i];
			}
			max[i] = ArrayOperation.maximumElement(col);
		}
		return max;
	}

	private static int[] minCol(int[][] arr, int m, int n) {
		int col[] = new int[n];
		int min[] = new int[n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				col[j] = arr[j][i];
			}
			min[i] = ArrayOperation.minimumElement(col);
		}
		return min;
	}

	public static int[] minRow(int[][] arr, int m, int n) {
		int row[] = new int[m];
		int min[] = new int[m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				row[j] = arr[i][j];
			}
			min[i] = ArrayOperation.minimumElement(row);
		}
		return min;
	}

	public static int[] singleArray(int[][] arr, int row, int col) {
		int[] arr2 = new int[row * col];
		int h = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr2[h] = arr[i][j];
				h++;
			}
		}
		return arr2;
	}

	public static int[] maxRow(int[][] arr, int m, int n) {
		int row[] = new int[m];
		int max[] = new int[m];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				row[j] = arr[i][j];
			}
			max[i] = ArrayOperation.maximumElement(row);
		}
		return max;
	}
}
