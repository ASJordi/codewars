package kyu7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class NameArrayCappingTest {

    @Test
    public void downcase() {
        String[] strings = new String[] {"jo", "nelson", "jurie"};
        assertArrayEquals(new String[] {"Jo", "Nelson", "Jurie"}, NameArrayCapping.capMe(strings));
    }

}
