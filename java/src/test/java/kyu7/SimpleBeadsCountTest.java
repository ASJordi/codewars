package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimpleBeadsCountTest {

    @Test
    public void test0() {
        assertEquals(0, SimpleBeadsCount.countRedBeads(0));
    }

    @Test
    public void test1() {
        assertEquals(0, SimpleBeadsCount.countRedBeads(1));
    }

    @Test
    public void test3() {
        assertEquals(4, SimpleBeadsCount.countRedBeads(3));
    }

    @Test
    public void test5() {
        assertEquals(8, SimpleBeadsCount.countRedBeads(5));
    }

}
