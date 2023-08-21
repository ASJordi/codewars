package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class HeronsFormulaTest {

    @Test
    public void sampleTests() {
        assertion(6,   3, 4, 5);
        assertion(24,  6, 8, 10);
    }

    private void assertion(double expected, double a, double b, double c) {
        assertEquals(
                String.format("Inputs: (%f, %f, %f)\n", a, b, c),
                expected,
                HeronsFormula.heron(a, b, c),
                0.01
        );
    }

}
