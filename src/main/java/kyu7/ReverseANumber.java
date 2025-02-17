package kyu7;

public class ReverseANumber {

    public static int reverse(int number) {
        StringBuilder reversedNumber = new StringBuilder();
        reversedNumber.append(number);
        reversedNumber.reverse();

        if (number < 0) {
            reversedNumber.deleteCharAt(reversedNumber.length() - 1);
            reversedNumber.insert(0, "-");
        }

        return Integer.parseInt(reversedNumber.toString());
    }

}
