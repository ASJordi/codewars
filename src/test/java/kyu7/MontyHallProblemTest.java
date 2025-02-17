package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MontyHallProblemTest {

    MontyHallProblem montyHall = new MontyHallProblem();

    @Test
    public void test() {
        assertEquals(71, montyHall.montyHallCase(1, new int[]{3, 3, 2, 3, 3, 2, 2, 3, 2, 2, 1, 1, 1, 1}));
        assertEquals(64, montyHall.montyHallCase(2, new int[]{3, 3, 2, 3, 3, 2, 2, 3, 2, 2, 1, 1, 1, 1}));
        assertEquals(64, montyHall.montyHallCase(3, new int[]{3, 3, 2, 3, 3, 2, 2, 3, 2, 2, 1, 1, 1, 1}));
    }

}
