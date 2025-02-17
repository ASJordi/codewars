package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TerminalGameMoveFunctionTest {

    @Test
    public void basicTests() {
        assertEquals(8, TerminalGameMoveFunction.move(0, 4));
        assertEquals(15, TerminalGameMoveFunction.move(3, 6));
        assertEquals(12, TerminalGameMoveFunction.move(2, 5));
    }

}
