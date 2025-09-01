package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CollatzTest {

    @Test
    void testSomething() {
        assertEquals("3->10->5->16->8->4->2->1", Collatz.collatz(3));
    }

}
