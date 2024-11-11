package kyu7;

public class LuckyNumber {

    public static boolean isLucky(long n) {
        int sum = 0;
        String[] numArr = String.valueOf(n).split("");

        for (String num : numArr) sum += Integer.parseInt(num);

        return sum % 9 == 0;
//        return n % 9 == 0;
    }

}
