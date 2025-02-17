package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeAFunctionThatDoesArithmeticTest {

    @Test
    public void testBasic() {
        assertEquals(3, MakeAFunctionThatDoesArithmetic.arithmetic(1, 2, "add"));
        assertEquals(6, MakeAFunctionThatDoesArithmetic.arithmetic(8, 2, "subtract"));
        assertEquals(10, MakeAFunctionThatDoesArithmetic.arithmetic(5, 2, "multiply"));
        assertEquals(4, MakeAFunctionThatDoesArithmetic.arithmetic(8, 2, "divide"));
    }

}
