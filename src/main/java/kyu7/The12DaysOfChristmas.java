package kyu7;

import java.util.*;

public class The12DaysOfChristmas {

    public static class HelpSaveChristmas implements Comparator<String> {
        @Override
        public int compare(final String line1, final String line2) {
            var l1 = Integer.parseInt("0" + line1.replaceAll("\\D", ""));
            var l2 = Integer.parseInt("0" + line2.replaceAll("\\D", ""));
            return l1 == l2 ? line2.length() - line1.length() : l2 - l1;
        }
    }

}
