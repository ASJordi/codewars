package kyu6;

public class Collatz {

    public static String collatz(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 1) {
            sb.append(n).append("->");
            n = (n % 2 == 0) ? n / 2 : 3 * n + 1;;
        }

        return sb.append(1).toString();
    }

}
