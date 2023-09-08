package kyu7;

import static org.junit.Assert.*;
import org.junit.Test;

public class NameArrayCappingTest {

    @Test
    public void downcase() {
        String[] strings = new String[] {"jo", "nelson", "jurie"};
        assertEquals(new String[] {"Jo", "Nelson", "Jurie"}, NameArrayCapping.capMe(strings));
    }

}
