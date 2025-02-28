package kyu7;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ArraySquareUpBTest {

    private static void testing(String act, String exp) {
        assertEquals(exp, act);
    }

    @Test
    void Basic_Tests() {
        System.out.println("Basic Tests");
        testing(Arrays.toString(ArraySquareUpB.squareUp(4)), Arrays.toString(new int[] {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1}));

        testing(Arrays.toString(ArraySquareUpB.squareUp(9)),
                Arrays.toString(new int[] {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 4, 3, 2, 1, 0, 0, 0, 0, 5, 4, 3, 2, 1, 0, 0, 0, 6, 5, 4, 3, 2, 1, 0, 0, 7, 6, 5, 4, 3, 2, 1, 0, 8, 7, 6, 5, 4, 3, 2, 1, 9, 8, 7, 6, 5, 4, 3, 2, 1}));

        testing(Arrays.toString(ArraySquareUpB.squareUp(1)), Arrays.toString(new int[] {1}));
    }

}
