package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DifferenceBetweenYearsTest {

    @Test
    public void basicTest() {
        assertEquals("For input \"1997/10/10, 2015/10/10\"", 18, DifferenceBetweenYears.howManyYears("1997/10/10", "2015/10/10"));
        assertEquals("For input \"1990/10/10, 2015/10/10\"", 25, DifferenceBetweenYears.howManyYears("1990/10/10", "2015/10/10"));
        assertEquals("For input \"2015/10/10, 1990/10/10\"", 25, DifferenceBetweenYears.howManyYears("2015/10/10", "1990/10/10"));
        assertEquals("For input \"1992/10/24, 2015/10/24\"", 23, DifferenceBetweenYears.howManyYears("1992/10/24", "2015/10/24"));
        assertEquals("For input \"2018/10/10, 2000/10/10\"", 18, DifferenceBetweenYears.howManyYears("2018/10/10", "2000/10/10"));
    }

}
