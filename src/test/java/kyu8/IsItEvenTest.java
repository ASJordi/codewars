package kyu8;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsItEvenTest {

    private IsItEven num;

    @BeforeEach
    public void setUp() throws Exception {
        num = new IsItEven();
    }

    @AfterEach
    public void setDown() throws Exception {
        num = null;
    }

    @Test
    public void test() {
        assertTrue(num.isEven(0));
        assertFalse(num.isEven(0.5));
        assertFalse(num.isEven(1));
        assertTrue(num.isEven(2));
        assertTrue(num.isEven(-4));
    }

}
