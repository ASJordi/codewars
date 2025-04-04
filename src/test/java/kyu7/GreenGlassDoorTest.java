package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GreenGlassDoorTest {

    @Test
    void testDoor() {
        GreenGlassDoor door = new GreenGlassDoor();
        String s = "You can write a comment, but not code";
        //Don't listen to the String, you can code!
        assertTrue(door.stepThroughWith("comment"), s);
    }

}
