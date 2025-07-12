package kyu7;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicMathAddOrSubtractTest {

    @Test
    @DisplayName("calculate(\"1plus2plus3plus4\")")
    void test1plus2plus3plus4() {
        assertEquals("10", BasicMathAddOrSubtract.calculate("1plus2plus3plus4"));
    }

    @Test
    @DisplayName("calculate(\"1minus2minus3minus4\")")
    void test1minus2minus3minus4() {
        assertEquals("-8", BasicMathAddOrSubtract.calculate("1minus2minus3minus4"));
    }

    @Test
    @DisplayName("calculate(\"1plus2plus3minus4\")")
    void test1plus2plus3minus4() {
        assertEquals("2", BasicMathAddOrSubtract.calculate("1plus2plus3minus4"));
    }

    @Test
    @DisplayName("calculate(\"1minus2plus3minus4\")")
    void test1minus2plus3minus4() {
        assertEquals("-2", BasicMathAddOrSubtract.calculate("1minus2plus3minus4"));
    }

    @Test@DisplayName("calculate(\"1plus2minus3plus4minus5\")")
    void test1plus2minus3plus4minus5() {
        assertEquals("-1", BasicMathAddOrSubtract.calculate("1plus2minus3plus4minus5"));
    }

}
