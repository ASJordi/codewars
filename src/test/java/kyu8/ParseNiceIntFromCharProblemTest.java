package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseNiceIntFromCharProblemTest {

    @Test
    public void test1() {
        assertEquals(5, ParseNiceIntFromCharProblem.howOld("5 years old"));
    }

    @Test
    public void test2() {
        assertEquals(9, ParseNiceIntFromCharProblem.howOld("9 years old"));
    }

    @Test
    public void test3() {
        assertEquals(1, ParseNiceIntFromCharProblem.howOld("1 year old"));
    }

}
