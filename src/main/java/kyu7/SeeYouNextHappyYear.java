package kyu7;

import java.util.stream.Stream;

public class SeeYouNextHappyYear {

    public static int nextHappyYear(int year) {
        int n = 0;
        for (int i = year + 1; i <= Integer.MAX_VALUE; i++) {
            String yearString = String.valueOf(i);
            if (Stream.of(yearString.split("")).distinct().count() == yearString.length()) {
                n = i;
                break;
            }
        }
        return n;
    }


}
