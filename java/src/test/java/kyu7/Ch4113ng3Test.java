package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Ch4113ng3Test {

    @Test
    public void testSomething() {
        assertEquals("Fund4m3nt41s", Ch4113ng3.nerdify("Fund4m3nt41s"));
        assertEquals("S3v3n", Ch4113ng3.nerdify("Seven"));
        assertEquals("Los 4ng313s", Ch4113ng3.nerdify("Los Angeles"));
        assertEquals("S3oijs314wuu3", Ch4113ng3.nerdify("Seoijselawuue"));
    }

}
