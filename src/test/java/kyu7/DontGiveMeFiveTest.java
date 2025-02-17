package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DontGiveMeFiveTest {

    @Test
    public void exampleTests() {
        assertEquals(8, DontGiveMeFive.dontGiveMeFive(1, 9));
        assertEquals(12, DontGiveMeFive.dontGiveMeFive(4, 17));
    }

}
