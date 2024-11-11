package kyu8;

import java.util.ArrayList;

public class FindNumbersWhichAreDivisibleByGivenNumber {

    public static int[] divisibleBy(int[] numbers, int divider) {

        ArrayList<Integer> nums = new ArrayList<>();

        for (int num : numbers){
            if (num % divider == 0) nums.add(num);
        }

        return nums.stream().mapToInt(Integer::intValue).toArray();

    }

}
