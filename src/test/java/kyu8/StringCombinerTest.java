package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCombinerTest {

    @Test
    public void test() {
        assertEquals("James Stevens", StringCombiner.combineNames("James","Stevens"));
    }

}
