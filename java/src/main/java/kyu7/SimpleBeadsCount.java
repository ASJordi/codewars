package kyu7;

public class SimpleBeadsCount {

    public static int countRedBeads(final int nBlue) {
        return Math.max(((nBlue - 1) * 2), 0);
    }

}
