package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicsGeneratorsOneTest {

    @Test
    public void testSomething() {
        BasicsGeneratorsOne g = new BasicsGeneratorsOne();
        assertEquals(1, g.next());
        assertEquals(2, g.next());
        assertEquals(3, g.next());
        assertEquals(4, g.next());
        assertEquals(5, g.next());
        assertEquals(10, g.next(10));
    }

}
