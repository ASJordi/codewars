package kyu7;

public class ArithmeticProgression {

    public static String arithmeticSequenceElements(int a, int d, long n) {
        StringBuilder sequence = new StringBuilder();

        while (n > 0){
            sequence.append(a).append(", ");
            a += d;
            n--;
        }

        return sequence.substring(0, sequence.lastIndexOf(","));
    }

}
