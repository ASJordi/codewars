package kyu7;

import java.util.*;

public class NumberOfPeopleInTheBus {

    public static int countPassengers(ArrayList<int[]> stops) {
        int total = 0;

        for (int[] stop : stops) {
            total += stop[0] - stop[1];
        }

        return total;
    }

}
