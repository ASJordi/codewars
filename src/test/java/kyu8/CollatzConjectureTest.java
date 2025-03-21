package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CollatzConjectureTest {

    @Test
    public void sampleTests() {
        assertEquals(CollatzConjecture.hotpo(1), 0);
        assertEquals(CollatzConjecture.hotpo(5), 5);
        assertEquals(CollatzConjecture.hotpo(6), 8);
        assertEquals(CollatzConjecture.hotpo(23), 15);
    }

}
