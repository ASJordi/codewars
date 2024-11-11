package kyu8;

import java.util.ArrayList;

public class ToSquareOrNotToSquare {

    public static int[] squareOrSquareRoot(int[] array) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int n : array){
            double sqrt = Math.sqrt(n);
            if (sqrt == Math.floor(sqrt)) nums.add((int) sqrt);
            else nums.add(n * n);
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();

    }

}
