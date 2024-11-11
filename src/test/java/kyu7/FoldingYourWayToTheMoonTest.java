package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FoldingYourWayToTheMoonTest {

    @Test
    public void sampleTests() {
        assertEquals((Long)42L, FoldingYourWayToTheMoon.fold(384000000.0));
        assertEquals((Long)0L, FoldingYourWayToTheMoon.fold(0.00005));
    }

}
