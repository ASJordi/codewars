package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MultiplyTest {

    @Test
    public void testSomething() {
        assertEquals(20.0, Multiply.multiply(10.0, 2.0), 0.0001);
    }
}
