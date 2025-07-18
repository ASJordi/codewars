package kyu7;

import java.util.ArrayList;
import java.util.List;

public class SumOfPowersOfItsDigits {

    public static long[] eqSumPowDig(long hmax, int exp) {
        List<Long> list = new ArrayList<>();

        for (long i = 2; i <= hmax; i++) {
            String s = String.valueOf(i);

            var e = s.chars()
                    .map(Character::getNumericValue)
                    .mapToLong(d -> (long) Math.pow(d, exp))
                    .sum();

            if (e == i) list.add(i);
        }

        return list.stream().mapToLong(Long::longValue).toArray();
    }

}
