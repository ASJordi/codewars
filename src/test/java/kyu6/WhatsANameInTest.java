package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WhatsANameInTest {

    @Test
    public void sampleTest() {
        assertTrue(WhatsANameIn.nameInStr("Across the rivers", "chris"));
        assertFalse(WhatsANameIn.nameInStr("Next to a lake", "chris"));
        assertFalse(WhatsANameIn.nameInStr("Under a sea", "chris"));
        assertFalse(WhatsANameIn.nameInStr("A crew that boards the ship", "chris"));
        assertFalse(WhatsANameIn.nameInStr("A live son", "Allison"));
    }

}
