package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleReversedParenthesisTest {

    @Test
    public void basicTests(){
        assertEquals(2, SimpleReversedParenthesis.solve(")()("));
        assertEquals(1, SimpleReversedParenthesis.solve("((()"));
        assertEquals(-1, SimpleReversedParenthesis.solve("((("));
        assertEquals(3, SimpleReversedParenthesis.solve("())((("));
        assertEquals(4, SimpleReversedParenthesis.solve("())()))))()()("));
    }

}
