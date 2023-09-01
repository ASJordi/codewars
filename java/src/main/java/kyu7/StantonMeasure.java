package kyu7;

public class StantonMeasure {

    public static int stantonMeasure(int[] arr) {
        int countNumberOne = 0;
        int stantonMeasure = 0;

        for (int a : arr) if (a == 1) countNumberOne++;
        for (int a : arr) if (a == countNumberOne) stantonMeasure++;

        return stantonMeasure;
    }

}
