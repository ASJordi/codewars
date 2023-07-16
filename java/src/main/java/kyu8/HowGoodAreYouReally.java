package kyu8;

import java.util.Arrays;

public class HowGoodAreYouReally {

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {

        int sum = Arrays.stream(classPoints).sum() + yourPoints;
        int count = Math.toIntExact(Arrays.stream(classPoints).count() + 1);
        return yourPoints > (sum / count);

        // not include yourPoints
        // return Arrays.stream(classPoints).average().orElse(0) < yourPoints;

    }

}
