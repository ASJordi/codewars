package kyu7;

import java.util.ArrayList;
import java.util.Comparator;

public class SortedYesNoHow {

    public static String isSortedAndHow(int[] array) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int a : array) arr.add(a);
        ArrayList<Integer> arrNaturalOrder = (ArrayList<Integer>) arr.clone();
        arrNaturalOrder.sort(Comparator.naturalOrder());
        ArrayList<Integer> arrReverseOrder = (ArrayList<Integer>) arr.clone();
        arrReverseOrder.sort(Comparator.reverseOrder());
        return arr.equals(arrNaturalOrder) ? "yes, ascending" :
                arr.equals(arrReverseOrder) ? "yes, descending" : "no";
    }

}
