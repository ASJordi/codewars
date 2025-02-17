package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SwapperTest {

    @Test
    public void testSomething() {
        Integer[] args = new Integer[]{1,2};

        Swapper r= new Swapper(args);
        r.swapValues();
        assertEquals(2, r.arguments[0], "Failed swapping numbers");
        assertEquals(1, r.arguments[1], "Failed swapping numbers");
    }

}
