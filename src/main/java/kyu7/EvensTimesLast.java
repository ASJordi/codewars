package kyu7;

public class EvensTimesLast {

    public static int evenLast(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0;

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) sum += numbers[i];
        }

        return sum * numbers[numbers.length - 1];
    }

}
