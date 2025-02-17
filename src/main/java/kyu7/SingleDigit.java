package kyu7;

public class SingleDigit {

    public static int singleDigit(int n) {
        if (Character.isDigit(Character.forDigit(n, 10))) return n;
        int newNum = convert(n);
        boolean isDigit = false;

        while (!isDigit) {
            if (newNum < 10) {
                isDigit = true;
            } else {
                newNum = convert(newNum);
            }
        }
        return newNum;
    }

    public static int convert(int n) {
        int nSum = 0;

        String[] binaryNum = Integer.toBinaryString(n).replace("0", "").split("");

        for (String s : binaryNum) nSum += Integer.parseInt(s);

        return nSum;
    }

}
