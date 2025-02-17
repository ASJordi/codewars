package kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NameArrayCappingTest {

    @Test
    public void downcase() {
        String[] strings = new String[] {"jo", "nelson", "jurie"};
        assertEquals(new String[] {"Jo", "Nelson", "Jurie"}, NameArrayCapping.capMe(strings));
    }

}
