package kyu7;

public class PalindromeChainLength {

    public static int palindromeChainLength(long n) {
		if (isPalindrome(n)) return 0;

		int steps = 0;

		while (!isPalindrome(n)) {
			long reverseNum = reverseNumber(n);
			n += reverseNum;
			steps++;
		}

		return steps;
    }

    private static boolean isPalindrome(long n) {
		String str = String.valueOf(n);
		String reverse = String.valueOf(reverseNumber(n));
		return str.equals(reverse);
    }

    private static long reverseNumber(long n) {
		StringBuilder sb = new StringBuilder();
		sb.append(String.valueOf(n));
		sb.reverse();
		return Long.parseLong(sb.toString());
    }

}
