package kyu8;

public class Collinearity {

    public static boolean collinearity(int x1, int y1, int x2, int y2) {
        if ((x1 == 0 && y1 == 0) || (x2 == 0 && y2 == 0)) return true;
        if ((x1 == 0 && x2 == 0) || (y1 == 0 && y2 == 0)) return true;

        double p, q;

        try {
            p = (double) x1 / x2;
            q = (double) y1 / y2;
        } catch (NumberFormatException e) {
            return false;
        }

        return p == q;
        // return x1 * y2 == y1 * x2;
    }

}
