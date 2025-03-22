package kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DrawStairsTest {

    @Test
    @DisplayName("Sample tests")
    void test3() {
        assertEquals("""
I
 I
  I""",
                DrawStairs.draw(3), "Stairs.draw(3)");
    }

}
