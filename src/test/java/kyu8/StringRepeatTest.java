package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringRepeatTest {

    @Test
    public void test4a() {
        assertEquals("aaaa", StringRepeat.repeatStr(4, "a"));
    }

    @Test
    public void test3Hello() {
        assertEquals("HelloHelloHello", StringRepeat.repeatStr(3, "Hello"));
    }

    @Test
    public void stringIsEmpty() {
        assertEquals("", StringRepeat.repeatStr(5, ""));
    }

    @Test
    public void test0kata() {
        assertEquals("", StringRepeat.repeatStr(0, "kata"));
    }

}
