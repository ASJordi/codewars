package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ValidParenthesesTest {
    
    @Test
    public void validCases() {
      runTest(true, "()");
      runTest(true, "((()))");
      runTest(true, "()()()");
      runTest(true, "(()())()");
      runTest(true, "()(())((()))(())()");
    }
    
    @Test
    public void invalidCases() {
      runTest(false, ")(");
      runTest(false, "()()(");
      runTest(false, "((())");
      runTest(false, "())(()");
      runTest(false, ")()");
      runTest(false, ")");
    }
    
    @Test
    public void emptyString() {
      runTest(true, "");
    }
    
    private void runTest(boolean expected, String input) {
      assertEquals(expected, ValidParentheses.validParentheses(input), "Test failed for input \""+input+"\"");
    }

}
