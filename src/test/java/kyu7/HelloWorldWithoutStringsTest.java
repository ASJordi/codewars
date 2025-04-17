package kyu7;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HelloWorldWithoutStringsTest {

    @Test
    public void testBasic() {
        assertEquals("Hello, World!", HelloWorldWithoutStrings.helloWorld());
    }

    @Test
    public void testRestriction() {
        assertTrue(checkNoString(), "You cannot use raw Strings");
    }

    private boolean checkNoString() {

        try (FileReader fr = new FileReader("src/main/java/kyu7/HelloWorldWithoutStrings.java", StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(fr)) {

            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("\"") || line.contains("'")) {
                    return false;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

}
