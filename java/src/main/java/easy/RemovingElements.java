package easy;

import java.util.ArrayList;

public class RemovingElements {

    public static Object[] removeEveryOther(Object[] arr) {

        ArrayList<Object> newArr = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) newArr.add(arr[i]);
        }

        return newArr.toArray();

    }

}
