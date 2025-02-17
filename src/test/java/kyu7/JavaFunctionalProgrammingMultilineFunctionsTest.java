package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JavaFunctionalProgrammingMultilineFunctionsTest {

    @Test
    public void testArea() throws Exception {
        Triangle t = new Triangle(5, 10);
        assertEquals(25D, JavaFunctionalProgrammingMultilineFunctions.f.applyAsDouble(t), 0.001);
        assertEquals(25D, t.getArea(), 0.001);
    }

}


