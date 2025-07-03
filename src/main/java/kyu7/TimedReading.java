package kyu7;

import java.util.Arrays;

public class TimedReading {

    public static int timedReading(final int maxLength, final String text) {
        return Arrays.stream(text.split("[^a-zA-Z]")).filter(w -> !w.isBlank() && w.length() <= maxLength).toArray().length;
    }

}
