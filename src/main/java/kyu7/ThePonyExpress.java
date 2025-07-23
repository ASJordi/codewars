package kyu7;

public class ThePonyExpress {

    public static int riders(final int[] stations) {
        int riders = 1;
        int sum = 0;

        for (int i = 1; i < stations.length; i++) {
            int current = stations[i - 1];
            sum += current;

            int next = stations[i];

            if (sum + next > 100) {
                riders++;
                sum = 0;
            }
        }

        return riders;
    }

}
