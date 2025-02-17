package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {

    @Test
    public void testHelloWorld() throws Exception {
        assertEquals("hello world!", HelloWorld.greet());
    }

}
