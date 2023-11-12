package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GetPlanetNameByIDTest {

    private void doTest(int id, String expected) {
        String actual = GetPlanetNameByID.getPlanetName(id);
        assertEquals(expected, actual);
    }

    @Test
    public void exampleTests() {
        doTest(2, "Venus");
        doTest(5, "Jupiter");
        doTest(3, "Earth");
    }

}
