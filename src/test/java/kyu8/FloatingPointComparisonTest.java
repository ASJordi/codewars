package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FloatingPointComparisonTest {

    @Test
    public void fixedTests() {
        Object[][] data = {
                {175.9827, 82.25, false},
                {-156.24037, -156.24038, true},
                {123.2345, 123.234501, true},
                {1456.3652, 1456.3641, false},
                {-1.234, -1.233999, true},
                {98.7655, 98.7654999, true},
                {-7.28495, -7.28596, false}
        };

        for (Object[] testCase : data) {
            double a = (double) testCase[0];
            double b = (double) testCase[1];
            boolean expected = (boolean) testCase[2];
            assertEquals(expected, FloatingPointComparison.approxEquals(a, b), String.format("Failed for inputs: a=%.4f, b=%.7f", a, b));
        }
    }

}
