package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ResponsibleDrinkingTest {

    @Test
    public void drinkinTest1() {
        ResponsibleDrinking drinkin = new ResponsibleDrinking();
        String expected = "1 glass of water";
        String actual = drinkin.hydrate("1 beer");
        assertEquals(expected, actual);
    }

    @Test
    public void drinkinTest3() {
        ResponsibleDrinking drinkin = new ResponsibleDrinking();
        String expected = "10 glasses of water";
        String actual = drinkin.hydrate("1 shot, 5 beers, 2 shots, 1 glass of wine, 1 beer");
        assertEquals(expected, actual);
    }

}
