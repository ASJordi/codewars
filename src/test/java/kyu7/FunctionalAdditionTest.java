package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FunctionalAdditionTest {

    @Test
    public void simpleAdd() {
        assertEquals(8, FunctionalAddition.add(3).applyAsInt(5));
    }

}
