package kyu7;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

public class UltimateArrayReverserTest {

    @Test
    public void FixedTest1() {
		assertArrayEquals(new String[] { "!", "eilt", "onn", "acIdn", "ast", "t", "ubgibe", "kilI" }, UltimateArrayReverser
		.reverse(new String[] { "I", "like", "big", "butts", "and", "I", "cannot", "lie!" }));
    }

    @Test
    public void FixedTest2() {
	assertArrayEquals(
		new String[] { "How", "many", "shrimp", "do", "you", "have", "to", "eat", "before", "your", "skin",
			"starts", "to", "turn", "pink?" },
		UltimateArrayReverser.reverse(new String[] { "?kn", "ipnr", "utotst", "ra", "tsn", "iksr", "uo", "yer",
			"ofebta", "eote", "vahu", "oyodpm", "ir", "hsyn", "amwoH" }));
    }

}
