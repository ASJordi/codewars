package easy;

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class AreaOrPerimeterTest {

    @Test
    public void isASquare(){
        assertEquals(16, AreaOrPerimeter.areaOrPerimeter(4 , 4));
    }

    @Test
    public void isARectangle() {
        assertEquals(32, AreaOrPerimeter.areaOrPerimeter(6 , 10));
    }
}
