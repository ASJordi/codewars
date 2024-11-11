package kyu7;

public class StrongNumber {

    public static String isStrongNumber(int num) {
        String[] digits = String.valueOf(num).split("");
        int sum = 0;

        for (String d : digits) sum += factorial(Integer.parseInt(d));

        return num == sum ? "STRONG!!!!" : "Not Strong !!";
    }

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <=n ; i++) fact *= i;
        return fact;
    }

}
