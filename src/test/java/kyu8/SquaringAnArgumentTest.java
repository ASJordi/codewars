package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquaringAnArgumentTest {

    @Test
    public void fixed_tests() {
        assertEquals(4, SquaringAnArgument.square(2));
        assertEquals(2500, SquaringAnArgument.square(50));
        assertEquals(1, SquaringAnArgument.square(1));
    }

}
