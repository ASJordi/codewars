package kyu7;

import static java.util.stream.IntStream.of;

public class PredictYourAge {

    public static int predictAge(int... ages) {
        return (int) Math.sqrt(of(ages).map(a -> a * a).sum()) / 2;
    }

}
