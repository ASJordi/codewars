package kyu7;

import java.util.function.Function;

public class MapOverAListOfLists {

    public static <T, R> R[][] gridMap(Function<T, R> fn, T[][] list) {

        R[][] result = (R[][]) new Object[list.length][];

        for (int i = 0; i < list.length; i++) {
            result[i] = (R[]) new Object[list[i].length];

            for (int j = 0; j < list[i].length; j++) {
                result[i][j] = fn.apply(list[i][j]);
            }
        }

        return result;

    }

}