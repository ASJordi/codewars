package kyu7;

import static java.util.stream.IntStream.of;

public class SurviveTheAttack {

    public static boolean block(int[] attackers, int[] defenders){

        int survived = defenders.length - attackers.length;

        for (int i = 0; i < Math.min(defenders.length, attackers.length); i++) {
            survived += Math.signum(defenders[i] - attackers[i]);
        }

        return survived > 0 || survived == 0 && of(defenders).sum() >= of(attackers).sum();

    }

}
