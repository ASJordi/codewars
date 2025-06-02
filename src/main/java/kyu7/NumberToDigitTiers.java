package kyu7;

public class NumberToDigitTiers {

    public static String[] createArrayOfTiers(int num) {
	String[] arr = String.valueOf(num).split("");
	StringBuilder tmp = new StringBuilder();

	for (int i = 0; i < arr.length; i++) {
	    tmp.append(arr[i]);
	    arr[i] = tmp.toString();
	}

	return arr;
    }

}
