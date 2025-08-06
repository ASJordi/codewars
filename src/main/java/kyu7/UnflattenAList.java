package kyu7;

import java.util.ArrayList;
import java.util.List;

public class UnflattenAList {

    public static Object[] unflatten(int[] flatArray) {
        List<Object> list = new ArrayList<>();
        int i = 0;

        while (i < flatArray.length) {
            if (flatArray[i] < 3) {
                list.add(flatArray[i]);
                i++;
            } else {
                int size = flatArray[i];

                if (i + size > flatArray.length) size = flatArray.length - i;
                int[] subArr = new int[size];

                for (int j = 0; j < size; j++) {
                    subArr[j] = flatArray[i + j];
                }

                list.add(subArr);
                i += size;
            }
        }

        return list.toArray(new Object[0]);
    }

}
