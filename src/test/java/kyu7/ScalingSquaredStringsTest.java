package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ScalingSquaredStringsTest {

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    @Test
    void test() {
        System.out.println("Fixed Tests scale");
        String a = "abcd\nefgh\nijkl\nmnop";
        String r = "aabbccdd\naabbccdd\naabbccdd\neeffgghh\neeffgghh\neeffgghh\niijjkkll\n"
                + "iijjkkll\niijjkkll\nmmnnoopp\nmmnnoopp\nmmnnoopp";
        testing(ScalingSquaredStrings.scale(a, 2, 3), r);
        testing(ScalingSquaredStrings.scale("", 5, 5), "");
        testing(ScalingSquaredStrings.scale("Kj\nSH", 1, 2),"Kj\nKj\nSH\nSH");
    }

}
