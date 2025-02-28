package kyu8;

public class CountOfPositivesSumOfNegatives {

    public static int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) return new int[]{};

        int countOfPositives = 0;
        int sumOfNegatives = 0;

        for (int num : input) {
            if (num > 0) countOfPositives++;
            if (num < 0) sumOfNegatives += num;
        }

        return new int[]{countOfPositives, sumOfNegatives};
    }

}
