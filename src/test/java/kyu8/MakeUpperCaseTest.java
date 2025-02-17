package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MakeUpperCaseTest {

    MakeUpperCase u = new MakeUpperCase();

    @Test
    public void testSomething() {
        assertEquals("HELLO", MakeUpperCase.MakeUpperCase("hello"));
    }

}
