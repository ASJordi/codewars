package kyu7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TheHighestProfitWinsTest {

    Random rand;

    @BeforeEach
    public void initTest() {
        rand = new Random();
    }

    @Test
    public void testExampleCases() {
        assertArrayEquals(new int[]{1, 5}, TheHighestProfitWins.minMax(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{5, 2334454}, TheHighestProfitWins.minMax(new int[]{2334454, 5}));
        assertArrayEquals(new int[]{1, 1}, TheHighestProfitWins.minMax(new int[]{1}));
    }

    @Test
    public void minMaxRandomTest() {
        for (int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            assertArrayEquals(new int[]{r, r}, TheHighestProfitWins.minMax(new int[]{r}));
        }
    }

}
