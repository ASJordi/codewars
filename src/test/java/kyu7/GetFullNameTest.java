package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GetFullNameTest {

    @Test
    public void test() {
        assertEquals("Clint Eastwood", new GetFullName("Clint", "Eastwood").getFullName());
    }

}
