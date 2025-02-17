package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class KataExampleTwistTest {

    @Test
    public void test() {
        String[] websites = KataExampleTwist.kataExampleTwist();
        assertTrue(websites.length > 0, "The array is still empty");
        assertTrue(websites.length == 1000, "The array does not equal 1,000");
        boolean allCodewars = true;
        for (int i = 0; i < websites.length; i++)
            if (!"codewars".equals(websites[i])) {
                allCodewars = false;
                break;
            }
        assertTrue(allCodewars, "Every element in the array must contain the value \"codewars\"");
    }

}
