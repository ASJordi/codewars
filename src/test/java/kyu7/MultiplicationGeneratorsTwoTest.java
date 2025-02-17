package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MultiplicationGeneratorsTwoTest {

    @Test
    public void next() throws Exception {
        MultiplicationGeneratorsTwo gen = MultiplicationGeneratorsTwo.of(1);
        assertEquals("1 x 1 = 1", "1 x 1 = 1", gen.next());
        assertEquals("1 x 2 = 2", "1 x 2 = 2", gen.next());
        assertEquals("1 x 3 = 3", "1 x 3 = 3", gen.next());
        assertEquals("1 x 4 = 4", "1 x 4 = 4", gen.next());
        assertEquals("1 x 5 = 5", "1 x 5 = 5", gen.next());
    }

}
