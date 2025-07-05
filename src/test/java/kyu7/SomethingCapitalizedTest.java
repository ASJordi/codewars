package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomethingCapitalizedTest {

    @Test
    public void exampleTests() {
        assertEquals("", SomethingCapitalized.testSomethingCapitalized(""));
        assertEquals("A", SomethingCapitalized.testSomethingCapitalized("a"));
        assertEquals("B", SomethingCapitalized.testSomethingCapitalized("b"));
        assertEquals("A A", SomethingCapitalized.testSomethingCapitalized("a a"));
        assertEquals("A B", SomethingCapitalized.testSomethingCapitalized("a b"));
        assertEquals("A B C", SomethingCapitalized.testSomethingCapitalized("a b c"));
        assertEquals("aA", SomethingCapitalized.testSomethingCapitalized("aa"));
    }

}
