package kyu7;

import java.util.List;

public class NiceArray {

    public static boolean isNice(Integer[] arr){
        if (arr.length == 0) return false;
        List<Integer> list = List.of(arr);

        for (int n : list) {
            if (!list.contains(n + 1) && !list.contains(n - 1)) return false;
        }

        return true;
    }

}
