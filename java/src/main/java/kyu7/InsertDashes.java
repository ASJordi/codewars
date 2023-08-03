package kyu7;

public class InsertDashes {

    public static String insertDash(int num) {
        String numString = Integer.toString(num);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numString.length() - 1; i++) {
            char currentChar = numString.charAt(i);
            char nextChar = numString.charAt(i + 1);

            result.append(currentChar);

            if (isOdd(currentChar) && isOdd(nextChar)) {
                result.append('-');
            }
        }

        result.append(numString.charAt(numString.length() - 1));
        return result.toString();
//        return (num+"").replaceAll("([13579])(?=[13579])", "$1-");
    }

    private static boolean isOdd(char c) {
        int digit = c - '0';
        return digit % 2 != 0;
    }


}
