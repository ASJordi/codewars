package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TheFirstNonRepeatedCharacterInAStringTest {

    @Test
    void test1() {
        final String input = "test";
        final Character output = TheFirstNonRepeatedCharacterInAString.firstNonRepeated(input);
        final Character expected = 'e';
        assertEquals(expected, output);
    }

    @Test
    void test2() {
        final String input = "teeter";
        final Character output = TheFirstNonRepeatedCharacterInAString.firstNonRepeated(input);
        final Character expected = 'r';
        assertEquals(expected, output);
    }

    @Test
    void test3() {
        final String input = "1122321235121222";
        final Character output = TheFirstNonRepeatedCharacterInAString.firstNonRepeated(input);
        final Character expected = '5';
        assertEquals(expected, output);
    }

}
