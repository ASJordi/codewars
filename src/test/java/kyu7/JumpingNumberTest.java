package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpingNumberTest {

    @Test
    public void Single_Digit_Number() {
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(9));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(1));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(7));
    }

    @Test
    public void Two_Digit_Number() {
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(23));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(32));
        assertEquals("Not!!", JumpingNumber.jumpingNumber(79));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(98));
    }

    @Test
    public void Larger_Numbers() {
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(8987));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(4343456));
        assertEquals("Jumping!!", JumpingNumber.jumpingNumber(98789876));
    }

}
