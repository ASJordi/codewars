package kyu7;

import java.util.ArrayList;
import java.util.Comparator;

public class SortingTheOddway {

    public static Double[] sortItOut(Double[] array) {
        ArrayList<Double> oddNumbers = new ArrayList<>();
        ArrayList<Double> evenNumbers = new ArrayList<>();

        for (double d : array) {
            if (Math.round(d) % 2 == 0) evenNumbers.add(d);
            else oddNumbers.add(d);
        }

        oddNumbers.sort(Comparator.naturalOrder());
        evenNumbers.sort(Comparator.reverseOrder());
        oddNumbers.addAll(evenNumbers);

        return oddNumbers.toArray(new Double[0]);
    }

}
