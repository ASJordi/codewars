package kyu8;

import java.util.stream.IntStream;

public class GravityFlip {

    public static int[] flip(char dir, int[] arr) {
        return IntStream.of(arr).boxed().sorted((a, b) -> dir > 77 ? a - b : b - a).mapToInt(i -> i).toArray();
    }

}
