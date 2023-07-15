package easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TerminalGameMoveFunctionTest {

    @Test
    public void basicTests() {
        assertEquals(8, TerminalGameMoveFunction.move(0, 4));
        assertEquals(15, TerminalGameMoveFunction.move(3, 6));
        assertEquals(12, TerminalGameMoveFunction.move(2, 5));
    }

}
