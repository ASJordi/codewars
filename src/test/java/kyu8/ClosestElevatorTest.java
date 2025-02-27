package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ClosestElevatorTest {

    @Test
    void exampleTests() {
        assertEquals("right", ClosestElevator.call(0, 0, 0), "call(0, 0, 0)");
        assertEquals("left", ClosestElevator.call(0, 1, 0), "call(0, 1, 0)");
        assertEquals("left", ClosestElevator.call(0, 2, 0), "call(0, 2, 0)");
    }

}
