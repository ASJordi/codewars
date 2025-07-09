package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumArrayWithDifferentBasesTest {

    @Test
    public void exampleTests() {
        System.out.println("Should return 4258");
        assertEquals(4258, SumArrayWithDifferentBases.sumItUp(new SumArrayWithDifferentBases.BasedNumbers[] {new SumArrayWithDifferentBases.BasedNumbers("101",16), new SumArrayWithDifferentBases.BasedNumbers("7640",8),new SumArrayWithDifferentBases.BasedNumbers("1",9)}));
        System.out.println("Should return 13");
        assertEquals(13, SumArrayWithDifferentBases.sumItUp(new SumArrayWithDifferentBases.BasedNumbers[] {new SumArrayWithDifferentBases.BasedNumbers("101",2),new SumArrayWithDifferentBases.BasedNumbers("10",8)}));
        System.out.println("Should return 2751");
        assertEquals(2751, SumArrayWithDifferentBases.sumItUp(new SumArrayWithDifferentBases.BasedNumbers[] {new SumArrayWithDifferentBases.BasedNumbers("ABC",16),new SumArrayWithDifferentBases.BasedNumbers("11",2)}));
    }

}
