package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferenceBetweenYearsTest {

    @Test
    public void basicTest() {
        assertEquals(18, DifferenceBetweenYears.howManyYears("1997/10/10", "2015/10/10"));
        assertEquals(25, DifferenceBetweenYears.howManyYears("1990/10/10", "2015/10/10"));
        assertEquals(25, DifferenceBetweenYears.howManyYears("2015/10/10", "1990/10/10"));
        assertEquals(23, DifferenceBetweenYears.howManyYears("1992/10/24", "2015/10/24"));
        assertEquals(18, DifferenceBetweenYears.howManyYears("2018/10/10", "2000/10/10"));
    }

}
