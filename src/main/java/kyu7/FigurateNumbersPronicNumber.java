package kyu7;

public class FigurateNumbersPronicNumber { // Figurate Numbers #2 - Pronic Number

    public static boolean isPronic(int n) {

        for (int i = 0; i <= n; i++) {
            int t = i * (i + 1);
            if (t == n) return true;
        }

        return false;

    }

}
