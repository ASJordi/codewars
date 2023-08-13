package kyu7;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DigitsExplosionTest {

    @Test
    public void sampleTest() {
        String[][] testArray = new String[][]{
                {"312", "333122"},
                {"102269","12222666666999999999"},
                {"0", ""},
                {"000", ""},
                {"123", "122333"}};
        Arrays.stream(testArray).forEach(x ->
                assertEquals("value " + x[0] + " is incorrect", x[1], DigitsExplosion.explode(x[0]))
        );
    }

}
