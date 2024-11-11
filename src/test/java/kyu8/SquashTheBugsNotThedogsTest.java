package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SquashTheBugsNotThedogsTest {

    @Test
    public void basicTests() {
        assertEquals("More than a handful!",SquashTheBugsNotThedogs.howManyDalmatians(26));
        assertEquals("Hardly any" ,SquashTheBugsNotThedogs.howManyDalmatians(8));
        assertEquals("More than a handful!" ,SquashTheBugsNotThedogs.howManyDalmatians(14));
        assertEquals("Woah that's a lot of dogs!" ,SquashTheBugsNotThedogs.howManyDalmatians(80));
        assertEquals("Woah that's a lot of dogs!" ,SquashTheBugsNotThedogs.howManyDalmatians(100));
        assertEquals("101 DALMATIANS!!!" ,SquashTheBugsNotThedogs.howManyDalmatians(101));
    }

}
