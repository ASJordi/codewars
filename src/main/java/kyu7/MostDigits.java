package kyu7;

import java.util.ArrayList;

public class MostDigits {

    public static int findLongest(int[] numbers) {
        ArrayList<Integer> lengths = new ArrayList<>();
        int max = -1;

        for (int number : numbers) lengths.add(Integer.toString(Math.abs(number)).length());

        for (int l : lengths) if (l > max) max = l;

        return numbers[lengths.indexOf(max)];
    }

}
