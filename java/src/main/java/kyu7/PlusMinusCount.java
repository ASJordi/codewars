package kyu7;

public class PlusMinusCount {

    public static int signChange(int[] arr) {
        int count = 0;

        if (arr.length == 0) return 0;

        int currentSign = arr[0] >= 0 ? 1 : -1;

        for (int i = 1; i < arr.length; i++) {
            int newSign = arr[i] >= 0 ? 1 : -1;

            if (newSign != currentSign) {
                count++;
                currentSign = newSign;
            }
        }

        return count;
    }

}
