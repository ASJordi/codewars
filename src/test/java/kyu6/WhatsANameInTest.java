package kyu6;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WhatsANameInTest {

    @Test
    public void sampleTest() {
        assertEquals(true, WhatsANameIn.nameInStr("Across the rivers", "chris"));
        assertEquals(false, WhatsANameIn.nameInStr("Next to a lake", "chris"));
        assertEquals(false, WhatsANameIn.nameInStr("Under a sea", "chris"));
        assertEquals(false, WhatsANameIn.nameInStr("A crew that boards the ship", "chris"));
        assertEquals(false, WhatsANameIn.nameInStr("A live son", "Allison"));
    }

}
