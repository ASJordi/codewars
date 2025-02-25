package kyu7;

public class FizzBuzz {

    public static String[] fizzBuzz(int n) {
        String[] result = new String[n];

        for (int i = 1; i <= n; i++) {
            var index = i - 1;
            if (i % 3 == 0 && i % 5 == 0) result[index] = "FizzBuzz";
            else if (i % 3 == 0) result[index] = "Fizz";
            else if (i % 5 == 0) result[index] = "Buzz";
            else result[index] = String.valueOf(i);
        }

        return result;
    }

}
