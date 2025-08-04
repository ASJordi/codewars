package kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class UglifyWordTest {

    @Test
    public void sampleTest() {
	assertEquals("AaA", UglifyWord.uglifyWord("AAA"));
	assertEquals("AaA", UglifyWord.uglifyWord("AaA"));
	assertEquals("BbB", UglifyWord.uglifyWord("BbB"));
	assertEquals("AaA-BbB-CcC", UglifyWord.uglifyWord("aaa-bbb-ccc"));
	assertEquals("AaA-BbB-CcC", UglifyWord.uglifyWord("AaA-BbB-CcC"));
	assertEquals("EeEe-FfFf-GgGg", UglifyWord.uglifyWord("eeee-ffff-gggg"));
	assertEquals("EeEe-FfFf-GgGg", UglifyWord.uglifyWord("EeEe-FfFf-GgGg"));
	assertEquals("QwE123AsDf456ZxC", UglifyWord.uglifyWord("qwe123asdf456zxc"));
	assertEquals("HeLlO WoRlD", UglifyWord.uglifyWord("Hello World"));
    }

}
