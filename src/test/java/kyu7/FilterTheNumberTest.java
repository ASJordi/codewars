package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FilterTheNumberTest {

    @Test
    public void exampleTests() {
        assertEquals(123, FilterTheNumber.filterString("123"));
        assertEquals(123, FilterTheNumber.filterString("a1b2c3"));
        assertEquals(123, FilterTheNumber.filterString("aa1bb2cc3dd"));
    }

}
