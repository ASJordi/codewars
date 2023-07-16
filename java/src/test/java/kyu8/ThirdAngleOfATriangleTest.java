package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ThirdAngleOfATriangleTest {

    @Test
    public void testOtherAngle() {
        assertEquals(123, ThirdAngleOfATriangle.otherAngle(45,12));
        assertEquals(70, ThirdAngleOfATriangle.otherAngle(50,60));
    }

}
