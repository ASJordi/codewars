package kyu7;

import java.util.Arrays;

public class DoubleSort {

    public static Object[] dbSort(Object[] a) {
        Arrays.sort(a, (o1, o2) -> {
            if (o1 instanceof Integer && o2 instanceof Integer) return Integer.compare((int) o1, (int) o2);
            else if (o1 instanceof Integer) return -1;
            else if (o2 instanceof Integer) return 1;
            else return o1.toString().compareTo(o2.toString());
        });

        return a;
    }

}
