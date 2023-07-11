package easy;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

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
