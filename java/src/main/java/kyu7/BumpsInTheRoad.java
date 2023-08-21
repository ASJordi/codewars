package kyu7;

public class BumpsInTheRoad {

    public static String bumps(final String road) {
        int bumps = 0;
        for (char c : road.toCharArray()) if (c == 'n') bumps++;
        return bumps <= 15 ? "Woohoo!" : "Car Dead";
    }

}
