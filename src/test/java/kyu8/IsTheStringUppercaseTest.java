package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsTheStringUppercaseTest {

    @Test
    public void basicTests() {
        assertFalse("Input: 'c'", IsTheStringUppercase.isUpperCase("c"));
        assertTrue("Input: 'C'", IsTheStringUppercase.isUpperCase("C"));
        assertFalse("Input: 'hello I AM DONALD'", IsTheStringUppercase.isUpperCase("hello I AM DONALD"));
        assertTrue("Input: 'HELLO I AM DONALD'", IsTheStringUppercase.isUpperCase("HELLO I AM DONALD"));
        assertFalse("Input: 'ACSKLDFJSgSKLDFJSKLDFJ'", IsTheStringUppercase.isUpperCase("ACSKLDFJSgSKLDFJSKLDFJ"));
        assertTrue("Input: 'ACSKLDFJSGSKLDFJSKLDFJ'", IsTheStringUppercase.isUpperCase("ACSKLDFJSGSKLDFJSKLDFJ"));
    }
    
}
