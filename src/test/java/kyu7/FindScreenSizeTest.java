package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindScreenSizeTest {

    @Test
    public void test4By3() {
        assertEquals("1024x768", FindScreenSize.findScreenHeight(1024, "4:3"));
    }

    @Test
    public void test16By9() {
        assertEquals("1280x720", FindScreenSize.findScreenHeight(1280, "16:9"));
    }

    @Test
    public void test32By9() {
        assertEquals("3840x1080", FindScreenSize.findScreenHeight(3840, "32:9"));
    }

}
