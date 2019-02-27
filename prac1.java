package abc;

public class prac1 {
	public static void main(String[] args) {
		String s = "Malayalam";
		int j = s.length()-1;
		int mid = s.length() / 2;
		boolean ab = true;
		for (int i = 0; i < mid; i++) {
			if (s.charAt(i) != s.charAt(j--)) {
				System.out.println(" it is not a palindrome ");
				ab = false;
				break;
			}
		}
		if(ab) {
			System.out.println("it is palindrome ");
		}

	}
}
