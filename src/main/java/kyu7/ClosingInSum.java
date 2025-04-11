package kyu7;

public class ClosingInSum {

    public static int closingInSum(long n) {
        var num = new StringBuilder();
        num.append(n);
        int sum = 0;

        while (num.length() > 0) {
            var first = num.charAt(0);
            num.deleteCharAt(0);

            if (num.isEmpty()) {
                sum += Character.getNumericValue(first);
                break;
            }

            var last = num.charAt(num.length() - 1);
            num.deleteCharAt(num.length() - 1);
            sum += Integer.parseInt(first + Character.toString(last));
        }

        return sum;
    }

}
