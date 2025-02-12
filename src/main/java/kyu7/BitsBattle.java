package kyu7;

public class BitsBattle {
    
    static String bitsBattle(int[] numbers) {
	int oddSum = 0;
	int evenSum = 0;
	
	for (int n : numbers) {
	    if (n != 0) {
		if (n % 2 == 0) evenSum += Integer.toBinaryString(n).replace("1", "").length();
		else oddSum += Integer.bitCount(n);
	    }
	}
	
	return oddSum == evenSum ? "tie" : oddSum > evenSum ? "odds win" : "evens win";
    }

}
