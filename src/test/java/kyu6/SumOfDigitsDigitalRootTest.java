package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfDigitsDigitalRootTest {

    @Test
    public void Test1() {
        assertEquals(7, SumOfDigitsDigitalRoot.digital_root(16), "Nope!");
    }

    @Test
    public void Test2() {
        assertEquals(6, SumOfDigitsDigitalRoot.digital_root(456), "Nope!");
    }

}
