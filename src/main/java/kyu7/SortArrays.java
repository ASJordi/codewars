package kyu7;

import java.util.Arrays;

public class SortArrays {

    public static int[] sortArray(int[] names) {
        return Arrays.stream(names).sorted().toArray();
    }

    public static double[] sortArray(double[] names) {
        return Arrays.stream(names).sorted().toArray();
    }

    public static long[] sortArray(long[] names) {
        return Arrays.stream(names).sorted().toArray();
    }

    public static float[] sortArray(float[] names) {
        Arrays.sort(names);
        return names;
    }

    public static Integer[] sortArray(Integer[] names) {
        Arrays.sort(names);
        return names;
    }

    public static String[] sortArray(String[] names) {
        Arrays.sort(names);
        return names;
    }

}
