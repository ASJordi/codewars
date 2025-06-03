package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class OdderThanTheRestTest {

    @Test
    public void sampleTests() {
        assertEquals(3,  OdderThanTheRest.oddOne(new int[]{2,4,6,7,10}), "Expected  3 in {2, 4, 6,[ 7], 10}");
        assertEquals(4,  OdderThanTheRest.oddOne(new int[]{2,16,98,10,13,78}), "Expected  4 in {2, 16, 98, 10,[ 13], 78}");
        assertEquals(4,  OdderThanTheRest.oddOne(new int[]{4,-8,98,-12,-7,90,100}), "Expected  4 in {4, -8, 98, -12,[ -7], 90, 100}");
        assertEquals(-1, OdderThanTheRest.oddOne(new int[]{2,4,6,8}), "Expected -1 in {2, 4, 6, 8}");
    }

}
