package kyu7;

import java.util.*;

public class HowManyDaysAreWeRepresentedInAForeignCountry {

    public static int daysRepresented (int [][] trips) {
        Set<Integer> set = new HashSet<>();

        for (int[] trip : trips) {
            for (int i = trip[0]; i <= trip[1]; i++) {
                set.add(i);
            }
        }

        return set.size();
    }

}
