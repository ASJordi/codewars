package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class UpAndDownTheStringGrowsTest {

    @Test
    public void upDownCheck() {
        String upDown = UpAndDownTheStringGrows.STRANGE_STRING.toUpperCase().toLowerCase();
        int length = UpAndDownTheStringGrows.STRANGE_STRING.length();
        int upDownLength = upDown.length();
        assertTrue("your string: \"" + UpAndDownTheStringGrows.STRANGE_STRING + "\".length() = " + length       + "\n" +
                "after .toUpperCase().toLowerCase():\n"                                                   +
                "result     : \"" + upDown                       + "\".length() = " + upDownLength + "\n" +
                length + " >= " + upDownLength + "\n", upDownLength > length
        );
    }

}
