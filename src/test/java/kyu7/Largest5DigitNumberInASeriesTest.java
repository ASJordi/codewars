package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Largest5DigitNumberInASeriesTest {
    
    @Test
    public void exampleTests() {
	assertEquals(83910, Largest5DigitNumberInASeries.solve("283910"));
	assertEquals(67890, Largest5DigitNumberInASeries.solve("1234567890"));
	assertEquals(74765, Largest5DigitNumberInASeries.solve("731674765"));
    }

}
