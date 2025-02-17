package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordMakerTest {

    @Test
    public void basicTest() {
        String a1 = "Give me liberty or give me death";
        String a2 = "Keep Calm and Carry On";
        assertEquals(String.format("For input \"%s\"", a1), "Gml0gmd", PasswordMaker.makePassword(a1));
        assertEquals(String.format("For input \"%s\"", a2), "KCaC0", PasswordMaker.makePassword(a2));
        assertEquals(String.format("For input \"%s\"", ""), "", PasswordMaker.makePassword(""));
    }

}
