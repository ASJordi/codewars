package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ShipTest {

    @Test
    public void emptyShipShouldNotWorthToAboard() {
        Ship ship = new Ship(0, 0);
        assertFalse(ship.isWorthIt());
    }

    @Test
    public void shipWithLotOfBootyWorthToAboard() {
        Ship ship = new Ship(40, 5);
        assertTrue(ship.isWorthIt());
    }

}
