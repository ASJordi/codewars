package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckThreeAndTwoTest {

    @Test
    public void testSomething() {
        assertEquals(true, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'a', 'b', 'b', 'b' }));
        assertEquals(false, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'c', 'a', 'c', 'b' }));
        assertEquals(false, new CheckThreeAndTwo().checkThreeAndTwo(new char[] { 'a', 'a', 'a', 'a', 'a' }));
    }

}
