package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShipTest {

    @Test
    public void emptyShipShouldNotWorthToAboard() {
        Ship ship = new Ship(0 , 0);
        assertEquals(false, ship.isWorthIt());
    }

    @Test
    public void shipWithLotOfBootyWorthToAboard() {
        Ship ship = new Ship(40 , 5);
        assertEquals(true, ship.isWorthIt());
    }

}
