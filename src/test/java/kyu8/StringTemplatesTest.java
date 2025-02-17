package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringTemplatesTest {

    @Test
    public void fixedTests() {
        assertEquals(StringTemplates.buildString("Cheese", "Milk", "Chocolate"), "I like Cheese, Milk, Chocolate!");
        assertEquals(StringTemplates.buildString("Cheese", "Milk"), "I like Cheese, Milk!");
        assertEquals(StringTemplates.buildString("Chocolate"), "I like Chocolate!");
    }

}
