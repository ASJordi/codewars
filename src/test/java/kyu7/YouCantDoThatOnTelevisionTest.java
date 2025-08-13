package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class YouCantDoThatOnTelevisionTest {

    @Test
    void test1() {
        assertEquals("water", YouCantDoThatOnTelevision.bucketOf("water"));
    }

    @Test
    void test2() {
        assertEquals("slime", YouCantDoThatOnTelevision.bucketOf("slime"));
    }

    @Test
    void test3() {
        assertEquals("sludge", YouCantDoThatOnTelevision.bucketOf("Will I get wet? I don't know."));
    }

    @Test
    void test4() {
        assertEquals("air", YouCantDoThatOnTelevision.bucketOf("This should be safe."));
    }

}
