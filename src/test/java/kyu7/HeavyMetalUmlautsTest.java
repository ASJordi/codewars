package kyu7;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HeavyMetalUmlautsTest {

    @BeforeAll
    public static void testUnicode(){
        if(!"Ä".equals("\u00c4")){
            //"Ä".equals("\u00c4") return false so use only escaped characters for this kata
            System.out.println("Make sure to use the \"escaped form\" for unicode characters e.g. \"\\u00c4\"");
        }
    }

    @Test
    public void basicTest1() {
        String expected = "\u00c4nn\u00f6\u00fcnc\u00efng th\u00eb M\u00e4cb\u00f6\u00f6k \u00c4\u00efr G\u00fc\u00eft\u00e4r";
        // "Ännöüncïng thë Mäcböök Äïr Güïtär";
        String actual = HeavyMetalUmlauts.heavyMetalUmlauts("Announcing the Macbook Air Guitar");
        assertEquals(expected, actual);
    }

    @Test
    public void basicTest2() {
        String expected = "F\u00e4c\u00ebb\u00f6\u00f6k \u00efntr\u00f6d\u00fcc\u00ebs n\u00ebw h\u00eb\u00e4v\u00ff m\u00ebt\u00e4l r\u00eb\u00e4ct\u00ef\u00f6n b\u00fctt\u00f6ns";
        // "Fäcëböök ïntrödücës nëw hëävÿ mëtäl rëäctïön büttöns";
        String actual = HeavyMetalUmlauts.heavyMetalUmlauts("Facebook introduces new heavy metal reaction buttons");
        assertEquals(expected, actual);
    }

    @Test
    public void basicTest3() {
        String expected = "Str\u00f6ng s\u00e4l\u00ebs \u00f6f G\u00f6\u00f6gl\u00eb's VR M\u00ebt\u00e4lh\u00eb\u00e4ds\u00ebts s\u00ebnd t\u00ebch st\u00f6ck pr\u00efc\u00ebs s\u00f6\u00e4r\u00efng";
        // "Ströng sälës öf Gööglë's VR Mëtälhëädsëts sënd tëch stöck prïcës söärïng";
        String actual = HeavyMetalUmlauts.heavyMetalUmlauts("Strong sales of Google's VR Metalheadsets send tech stock prices soaring");
        assertEquals(expected, actual);
    }

    @Test
    public void basicTest4() {
        String expected = "V\u00ebg\u00e4n Bl\u00e4ck M\u00ebt\u00e4l Ch\u00ebf h\u00efts th\u00eb b\u00efg t\u00efm\u00eb \u00f6n \u00c4m\u00e4z\u00f6n TV";
        // "Vëgän Bläck Mëtäl Chëf hïts thë bïg tïmë ön Ämäzön TV";
        String actual = HeavyMetalUmlauts.heavyMetalUmlauts("Vegan Black Metal Chef hits the big time on Amazon TV");
        assertEquals(expected, actual);
    }

}
