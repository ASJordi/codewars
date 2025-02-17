package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FormattingDecimalPlacesOneTest {

    @Test
    public void Test_01() {
        assertEquals(10.12, FormattingDecimalPlacesOne.twoDecimalPlaces(10.1289767789), 0.00);
    }

    @Test
    public void Test_Negative_02() {
        assertEquals(-7488.83, FormattingDecimalPlacesOne.twoDecimalPlaces(-7488.83485834983), 0.00);
    }

}
