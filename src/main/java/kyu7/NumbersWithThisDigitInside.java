package kyu7;

public class NumbersWithThisDigitInside {

    public static long[] NumbersWithDigitInside(long x, long d) {
	long count = 0;
	long sum = 0;
	long product = 1;

	for (long i = 1; i <= x; i++) {
	    if (String.valueOf(i).contains(d + "")) {
		count++;
		sum += i;
		product *= i;
	    }
	}

	return new long[] { count, sum, (count == 0 ? 0 : product) };
    }

}
