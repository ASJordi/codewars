package kyu8;

import java.util.Arrays;

public class PythagoreanTriple {

    public int pythagoreanTriple(int[] triple) {

        Arrays.sort(triple);

        int a = (int) Math.pow(triple[0], 2);
        int b = (int) Math.pow(triple[1], 2);
        int c = (int) Math.pow(triple[2], 2);

        return (a + b == c) ? 1 : 0;
        // return triple[0] * triple[0] + triple[1] * triple[1] == triple[2] * triple[2] ? 1 : 0;

    }

}
