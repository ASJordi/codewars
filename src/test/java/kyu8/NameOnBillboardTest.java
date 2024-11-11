package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NameOnBillboardTest {

    private void doTest(int expected, String name) {
        doTest(expected, name, 30);
    }

    private void doTest(int expected, String name, int price) {
        assertEquals(expected, NameOnBillboard.billboard(name, price));
    }

    @Test
    public void testBasic() {
        doTest(600, "Jeong-Ho Aristotelis");
        doTest(570, "Abishai Charalampos");
        doTest(420, "Idwal Augustin");
        doTest(260, "Hadufuns John", 20);
        doTest(570, "Zoroaster Donnchadh");
        doTest(450, "Claude Miljenko");
        doTest(165, "Werner Vígi", 15);
        doTest(420, "Anani Fridumar");
        doTest(270, "Paolo Oli");
        doTest(600, "Hjalmar Liupold", 40);
        doTest(390, "Simon Eadwulf");
    }

}
