package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GodTest {

    @Test
    public void makingAdam(){
        Human[] paradise = God.create();
        assertEquals(true, paradise[0] instanceof Man, "Adam are a man");
    }

}
