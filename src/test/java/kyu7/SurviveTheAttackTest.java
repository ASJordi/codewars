package kyu7;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;

public class SurviveTheAttackTest {

    @Test
    public void testDefenders() {
        assertEquals(true, SurviveTheAttack.block(new int[] { 1, 3, 5, 7 }, new int[] { 2, 4, 6, 8 }));
        assertEquals(false, SurviveTheAttack.block(new int[] { 2, 9, 9, 7 }, new int[] { 1, 1, 3, 8 }));
        assertEquals(true, SurviveTheAttack.block(new int[] { 10, 10, 1, 1 }, new int[] { 4, 4, 7, 7 }));
        assertEquals(true, SurviveTheAttack.block(new int[] { }, new int[] { 1,2,3 }));
        assertEquals(false, SurviveTheAttack.block(new int[] {1,2,3 }, new int[] { }));
        assertEquals(true, SurviveTheAttack.block(new int[] {4, 9, 18, 6, 45, 39, 6, 26, 19 }, new int[] { 5, 15, 7, 28, 50, 7, 34 }));
        assertEquals(false, SurviveTheAttack.block(new int[] {24, 8, 26, 28, 6, 32, 46, 5, 43, 19 }, new int[] {15, 50, 43, 40, 49, 15, 37 }));
    }

    @Test
    public void emptyTest() {
        assertEquals(false, SurviveTheAttack.block(new int[] { 1, 5, 3 }, new int[] {}));
        assertEquals(false, SurviveTheAttack.block(new int[] { 0 }, new int[] {}));
        assertEquals(true, SurviveTheAttack.block(new int[] {}, new int[] { 8, 7, 1, 9 }));
    }

    @Test
    public void diffLengthTest() {
        assertEquals(true, SurviveTheAttack.block(new int[] { 1, 5, 3 }, new int[] { 2, 2, 6, 8 }));
        assertEquals(false, SurviveTheAttack.block(new int[] { 1, 9, 3 }, new int[] {}));
        assertEquals(false, SurviveTheAttack.block(new int[] { 1, 3, 5, 7 }, new int[] {2, 4}));
    }

    @Test
    public void drawTest() {
        assertEquals(true, SurviveTheAttack.block(new int[] { 8, 7, 1, 9 }, new int[] { 8, 7, 1, 9 }));
        assertEquals(false, SurviveTheAttack.block(new int[] { 1, 3, 5, 7 }, new int[] { 2, 2, 6, 5 }));
        assertEquals(true, SurviveTheAttack.block(new int[] { 1, 9, 3, 6 }, new int[] { 4, 8, 5, 5 }));

    }

    @Test
    public void randomTest() {
        Random random = new Random();

        for (int i = 1; i <= 200; i++) {
            int attackers[] = new int[random.nextInt(10)];
            int defenders[] = new int[random.nextInt(10)];
            for (int j = 0; j < attackers.length; j++) {
                attackers[j] = random.nextInt(100);
            }
            for (int j = 0; j < defenders.length; j++) {
                defenders[j] = random.nextInt(100);
            }
            assertEquals(blockTest(attackers, defenders), SurviveTheAttack.block(attackers, defenders));
        }

    }

    public static boolean blockTest(int[] attackers, int[] defenders) {
        int a = 0;
        int d = 0;
        int menor = attackers.length;
        if (attackers.length < defenders.length) {
            menor = attackers.length;
            d+=defenders.length- menor;
        } else if (attackers.length > defenders.length) {
            menor = defenders.length;
            a+=attackers.length- menor;
        }

        for (int i = 0; i < menor; i++) {
            if (attackers[i] < defenders[i])
                d++;
            if (attackers[i] > defenders[i])
                a++;

        }

        if (a == d) {
            a = 0;
            d = 0;
            for (int i : defenders) {
                d += i;
            }
            for (int i : attackers) {
                a += i;
            }
        }

        if (a > d) return false;
        if (a < d) return true;

        return true;

    }


}
