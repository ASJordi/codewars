package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FunctionalAdditionTest {

    @Test
    public void simpleAdd() {
        assertEquals("Kata.add(3,5)", 8, FunctionalAddition.add(3).applyAsInt(5));
    }

}
