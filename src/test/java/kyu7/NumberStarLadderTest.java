package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberStarLadderTest {

    String a1 = "1\n1*2\n1**3";
    String a2 = "1\n1*2\n1**3\n1***4\n1****5\n1*****6\n1******7";
    String a3 = "1\n1*2\n1**3\n1***4\n1****5\n1*****6\n1******7\n1*******8\n1********9\n1*********10\n1**********11\n1***********12\n1************13\n1*************14\n1**************15\n1***************16\n1****************17\n1*****************18\n1******************19\n1*******************20";

    @Test
    public void basicTest(){
        assertEquals("For input \"1\"", "1", NumberStarLadder.pattern(1));
        assertEquals("For input \"2\"", "1\n1*2", NumberStarLadder.pattern(2));
        assertEquals("For input \"3\"", a1, NumberStarLadder.pattern(3));
        assertEquals("For input \"7\"", a2, NumberStarLadder.pattern(7));
        assertEquals("For input \"20\"", a3, NumberStarLadder.pattern(20));
    }

}
