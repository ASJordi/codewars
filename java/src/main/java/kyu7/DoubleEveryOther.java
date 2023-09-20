package kyu7;

public class DoubleEveryOther {

    public static int[] doubleEveryOther(int[] a){
        int[] numbers = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) numbers[i] = a[i] * 2;
            else numbers[i] = a[i];
        }

        return numbers;
    }

}
