package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GhostCodeTest {

    @Test
    public void exampleTests() {
        String result = GhostCode.helloName("Javatlacati");
        assertEquals("Hello my name is Javatlacati", result, "Hello my name is Javatlacati is not " + result);
    }

}
