package kyu7;

public class SimpleStringReversal {

    public static String solve(String s) {
        char[] inputArray = s.toCharArray();
        char[] result = new char[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == ' ') {
                result[i] = ' ';
            }
        }

        int j = result.length - 1;
        for (char c : inputArray) {

            if (c != ' ') {
                if (result[j] == ' ') j--;
                result[j] = c;
                j--;
            }
        }
        return String.valueOf(result);
    }

}
