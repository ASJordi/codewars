package kyu8;

public class Pillars {

    public static int pillars(int numPill, int dist, int width){

        if (numPill == 0) throw new IllegalArgumentException("Number of pillars must be greater than 0");
        if (numPill == 1) return 0;

        int totalWidth = (numPill - 2) * width;
        int distance = ((numPill - 1) * (dist * 100)) + totalWidth;


        return distance;

    }

}
