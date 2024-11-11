package kyu7;

public class DisariumNumber {

    public static String disariumNumber(int number) {
        String num = String.valueOf(number);
        int newNum = 0;

        for (int i = 0; i < num.length(); i++) {
            int n = Integer.parseInt(Character.toString(num.charAt(i)));
            newNum += Math.pow(n, i + 1);
        }

        return newNum == number ? "Disarium !!" : "Not !!";
    }

}
