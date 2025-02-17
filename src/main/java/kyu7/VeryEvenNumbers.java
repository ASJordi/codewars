package kyu7;

public class VeryEvenNumbers {

    public static boolean isVeryEvenNumber(int number) {
        if (number < 10) return number % 2 == 0;

        while (number >= 10) {
            String[] digits = String.valueOf(number).split("");
            int sum = 0;
            for (String digit : digits) sum += Integer.parseInt(digit);
            number = sum;
        }

        return number % 2 == 0;
    }

}
