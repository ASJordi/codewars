package kyu7;

public class SumOfNumbersFrom0ToN {

    public static String showSequence(int value) {

        if (value < 0) return (value + "<0");

        if (value == 0) return "0=0";

        int sum = 0;
        StringBuilder res = new StringBuilder();
        res.append("0");

        for (int i = 1; i <= value; i++) {
            res.append("+").append(i);
            sum += i;
        }

        res.append(" = ").append(sum);
        return res.toString();

    }

}
