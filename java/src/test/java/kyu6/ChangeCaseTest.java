package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ChangeCaseTest {

    @Test
    public void changeIt(){
        assertEquals("Hello world", ChangeCase.toSentenceCase("Hello World"));
        assertEquals("hello world", ChangeCase.toLowerCase("Hello World"));
        assertEquals("HELLO WORLD", ChangeCase.toUpperCase("Hello World"));
        assertEquals("Hello World", ChangeCase.capitalizeEachWord("Hello World"));
        assertEquals("hELLO wORLD", ChangeCase.toToggleCase("Hello World"));
    }

}
