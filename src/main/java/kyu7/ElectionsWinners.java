package kyu7;

import java.util.Arrays;

public class ElectionsWinners {

    static int find(final int[] votes, final int k) {
        int max = Arrays.stream(votes).max().getAsInt();
        int[] possibleWinners = Arrays.stream(votes).filter(v -> v + k > max).toArray();

        return possibleWinners.length != 0 ? possibleWinners.length : (int) Arrays.stream(votes).filter(v -> v == max).count() == 1 ? 1 : 0;
    }

}
