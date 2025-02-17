package kyu7;

public class RoundUpToTheNextMultipleOf5 {

    public static int roundToNext5(int number) {
        if (number % 5 == 0) return number;

        while (number % 5 != 0) {
            number++;
        }

        return number;
    }

}
