package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VowelRemoverTest {

    @Test
    public void basicTest() {
        assertEquals("hll", VowelRemover.shortcut("hello"));
        assertEquals("hw r y tdy?", VowelRemover.shortcut("how are you today?"));
        assertEquals("cmpln", VowelRemover.shortcut("complain"));
        assertEquals("nvr", VowelRemover.shortcut("never"));
    }

}
