package kyu7;

public class SquareEveryDigit {

    public int squareDigits(int n) {
        StringBuilder res = new StringBuilder();
        String[] nums = String.valueOf(n).split("");

        for (String num : nums) res.append(Integer.parseInt(num) * Integer.parseInt(num));

        return Integer.parseInt(res.toString());
    }

}
