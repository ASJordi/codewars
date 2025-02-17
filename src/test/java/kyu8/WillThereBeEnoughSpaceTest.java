package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WillThereBeEnoughSpaceTest {

    @Test
    public void testBob() {
        assertEquals(0, WillThereBeEnoughSpace.enough(10, 5, 5), "Should return 0.");
        assertEquals(10, WillThereBeEnoughSpace.enough(100, 60, 50), "Should return 10.");
        assertEquals(0, WillThereBeEnoughSpace.enough(20, 5, 5), "Should return 0.");
    }


}
