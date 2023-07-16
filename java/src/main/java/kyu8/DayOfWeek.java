package kyu8;

import java.util.HashMap;

public class DayOfWeek {

    public static String getDay(int n) {

        HashMap<Integer, String> days = new HashMap<>(){{
            put(1, "Sunday");
            put(2, "Monday");
            put(3, "Tuesday");
            put(4, "Wednesday");
            put(5, "Thursday");
            put(6, "Friday");
            put(7, "Saturday");
        }};

        return days.getOrDefault(n, "Wrong, please enter a number between 1 and 7");

    }

}
