package kyu7;

public class FindTheNextPerfectSquare {

    public static long findNextSquare(long sq) {
        if (Math.sqrt(sq) % 1 != 0) return -1;
        int next = (int) Math.floor(Math.sqrt(sq)) + 1;
        return (long) next * next;
    }

}
