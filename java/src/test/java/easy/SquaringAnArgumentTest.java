package easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SquaringAnArgumentTest {

    @Test
    public void fixed_tests() {
        assertEquals(4, SquaringAnArgument.square(2));
        assertEquals(2500, SquaringAnArgument.square(50));
        assertEquals(1, SquaringAnArgument.square(1));
    }

}
