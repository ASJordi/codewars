package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCompressionTest {

    @Test
    public void test() {
        assertEquals("[[14,\"a\"],[1,\"b\"],[41,\"a\"],[1,\"c\"]]", BasicCompression.compress("aaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac"));
        assertEquals("abcde", BasicCompression.compress("abcde"));
        assertEquals("aaaaaaaaaaaaaabaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaac", BasicCompression.decompress("[[14,\"a\"],[1,\"b\"],[41,\"a\"],[1,\"c\"]]"));
        assertEquals("abcde", BasicCompression.decompress("abcde"));
    }

}
