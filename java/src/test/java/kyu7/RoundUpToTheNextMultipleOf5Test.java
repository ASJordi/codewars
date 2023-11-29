package kyu7;

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

public class RoundUpToTheNextMultipleOf5Test {

    @Test
    public void basicTests() {
        int[][] arr = {
                {0, 0},
                {1, 5},
                {3, 5},
                {5, 5},
                {7, 10},
                {39, 40}
        };
        Arrays.stream(arr)
                .forEach(
                        (testCase) -> {
                            assertEquals(
                                    "Input: " + testCase[0],
                                    testCase[1],
                                    RoundUpToTheNextMultipleOf5.roundToNext5(testCase[0]));
                        });
    }

}
