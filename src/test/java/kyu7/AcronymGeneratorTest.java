package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AcronymGeneratorTest {

    @Test
    public void testSimple() throws Exception {
        assertEquals("TM", AcronymGenerator.createAcronym("Meyer", "Thomas"));
    }

    @Test
    public void testMultipleLastNames() throws Exception {
        assertEquals("PMS", AcronymGenerator.createAcronym("Meyer-Schmidt", "Paul"));
    }

    @Test
    public void testMultipleFirstNamesWithBlank() throws Exception {
        assertEquals("JEM", AcronymGenerator.createAcronym("Mueller", "Jan Erich"));
    }

    @Test
    public void testMultipleFirstNamesWithDash() throws Exception {
        assertEquals("JES", AcronymGenerator.createAcronym("Schmidt", "Jan-Erich"));
    }

    @Test
    public void testVonName() throws Exception {
        assertEquals("PvL", AcronymGenerator.createAcronym("von Lahnstein", "Peter"));
    }

}
