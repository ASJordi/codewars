package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsTheStringUppercaseTest {

    @Test
    public void basicTests() {
        assertFalse(IsTheStringUppercase.isUpperCase("c"), "Input: 'c'");
        assertTrue(IsTheStringUppercase.isUpperCase("C"), "Input: 'C'");
        assertFalse(IsTheStringUppercase.isUpperCase("hello I AM DONALD"), "Input: 'hello I AM DONALD'");
        assertTrue(IsTheStringUppercase.isUpperCase("HELLO I AM DONALD"), "Input: 'HELLO I AM DONALD'");
        assertFalse(IsTheStringUppercase.isUpperCase("ACSKLDFJSgSKLDFJSKLDFJ"), "Input: 'ACSKLDFJSgSKLDFJSKLDFJ'");
        assertTrue(IsTheStringUppercase.isUpperCase("ACSKLDFJSGSKLDFJSKLDFJ"), "Input: 'ACSKLDFJSGSKLDFJSKLDFJ'");
    }

}
