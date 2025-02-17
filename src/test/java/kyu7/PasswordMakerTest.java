package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordMakerTest {

    @Test
    public void basicTest() {
        String a1 = "Give me liberty or give me death";
        String a2 = "Keep Calm and Carry On";
        assertEquals("Gml0gmd", PasswordMaker.makePassword(a1), String.format("For input \"%s\"", a1));
        assertEquals("KCaC0", PasswordMaker.makePassword(a2), String.format("For input \"%s\"", a2));
        assertEquals("", PasswordMaker.makePassword(""), String.format("For input \"%s\"", ""));
    }

}
