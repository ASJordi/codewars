package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildASquareTest {

    @Test
    public void exampleTests() {
        assertEquals("+++\n+++\n+++", BuildASquare.generateShape(3));
        assertEquals("+++++\n+++++\n+++++\n+++++\n+++++", BuildASquare.generateShape(5));
        assertEquals("++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++\n++++++++", BuildASquare.generateShape(8));
    }

}
