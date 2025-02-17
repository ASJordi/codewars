package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing123Test {

    @Test
    public void basicTests() {
        assertEquals(List.of(), Testing123.number(List.of()));
        assertEquals(Arrays.asList("1: a", "2: b", "3: c"), Testing123.number(Arrays.asList("a", "b", "c")));
        assertEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), Testing123.number(Arrays.asList("", "", "", "", "")));
    }

}
