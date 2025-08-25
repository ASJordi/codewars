package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicEncryptionTest {

    @Test
    public void testDecrypt() throws Exception {
	BasicEncryption enc = new BasicEncryption();
	assertEquals("", enc.encrypt("", 1), "text = '', rule = 1");
	assertEquals("b", enc.encrypt("a", 1), "text = 'a', rule = 1");
	assertEquals("rngcug\"gpet{rv\"og", enc.encrypt("please encrypt me", 2), "text = 'please encrypt me', rule = 2");
    }

}
