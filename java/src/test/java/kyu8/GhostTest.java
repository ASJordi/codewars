package kyu8;

import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.*;

public class GhostTest {

    private final List<String> colors = new ArrayList<>(Arrays.asList("white", "yellow", "purple", "red"));

    @Test
    public void basicTest() {
        Ghost g = new Ghost();
        String color = g.getColor();
        assertTrue(colors.contains(color));
    }

}
