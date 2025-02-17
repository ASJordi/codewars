package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmailAddressObfuscatorTest {

    @Test
    public void test1() {
        assertEquals("test [at] 123 [dot] com",
                EmailAddressObfuscator.obfuscate("test@123.com"));
    }

    @Test
    public void test2() {
        assertEquals("Code_warrior [at] foo [dot] ac [dot] uk",
                EmailAddressObfuscator.obfuscate("Code_warrior@foo.ac.uk"));
    }

}
