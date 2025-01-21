package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConvertALinkedListToAStringTest {

    @Test
    public void sampleTests() {
        assertEquals("1 -> 2 -> 3 -> null", ConvertALinkedListToAString.stringify(new ConvertALinkedListToAString.Node(1, new ConvertALinkedListToAString.Node(2, new ConvertALinkedListToAString.Node(3)))));
        assertEquals("0 -> 1 -> 4 -> 9 -> 16 -> null", ConvertALinkedListToAString.stringify(new ConvertALinkedListToAString.Node(0, new ConvertALinkedListToAString.Node(1, new ConvertALinkedListToAString.Node(4, new ConvertALinkedListToAString.Node(9, new ConvertALinkedListToAString.Node(16)))))));
        assertEquals("null", ConvertALinkedListToAString.stringify(null));
    }

}
