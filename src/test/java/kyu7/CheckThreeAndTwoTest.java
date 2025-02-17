package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CheckThreeAndTwoTest {

    @Test
    public void testSomething() {
        assertTrue(new CheckThreeAndTwo().checkThreeAndTwo(new char[]{'a', 'a', 'b', 'b', 'b'}));
        assertFalse(new CheckThreeAndTwo().checkThreeAndTwo(new char[]{'a', 'c', 'a', 'c', 'b'}));
        assertFalse(new CheckThreeAndTwo().checkThreeAndTwo(new char[]{'a', 'a', 'a', 'a', 'a'}));
    }

}
