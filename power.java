package abc;

import java.util.Scanner;

public class power {
	public static void main(String[] args) {
		Scanner ab = new Scanner(System.in);
		System.out.println("Enter the num 1 ");
		int m = ab.nextInt();
		System.out.println("Enter the num 2 ");
		int n = ab.nextInt();
		int r=1,t;;
		for(int i=1;i<=n;i++) {
			r*=m;
		}
		System.out.println(m+ "^"+n+" ="+r);
	}
}
