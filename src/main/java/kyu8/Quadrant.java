package kyu8;

public class Quadrant {

    public static int quadrant (int x, int y) {
        if (x == 0 && y == 0) throw new IllegalArgumentException("x and y cannot be 0");
        return (x > 0) ? ((y > 0) ? 1 : 4) : ((y > 0) ? 2 : 3);
    }
}
