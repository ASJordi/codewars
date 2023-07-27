package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleStringReversalTest {

    @Test
    public void basicTests(){
        assertEquals("srawedoc", SimpleStringReversal.solve("codewars"));
        assertEquals("edoc ruoy", SimpleStringReversal.solve("your code"));
        assertEquals("skco redo cruoy", SimpleStringReversal.solve("your code rocks"));
    }

}
