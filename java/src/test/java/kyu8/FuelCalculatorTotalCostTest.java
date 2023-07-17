package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FuelCalculatorTotalCostTest {

    @Test
    public void exampleTests(){
        assertEquals(5.65d, FuelCalculatorTotalCost.fuelPrice(5, 1.23d), 0.001d);
        assertEquals(18.40d, FuelCalculatorTotalCost.fuelPrice(8, 2.5d), 0.001d);
        assertEquals(27.50d, FuelCalculatorTotalCost.fuelPrice(5, 5.6d),  0.001d);
    }

}
