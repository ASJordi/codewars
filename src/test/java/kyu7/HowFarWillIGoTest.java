package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HowFarWillIGoTest {

    @Test
    void exampleTests() {
        assertEquals(1120, HowFarWillIGo.travel(1000, 10, 127, 14));
        assertEquals(1000, HowFarWillIGo.travel(100, 10, 0, 10));
        assertEquals(1000, HowFarWillIGo.travel(100, 10, 0, 10));
        assertEquals(450, HowFarWillIGo.travel(25, 50, 120, 18));
    }

}
