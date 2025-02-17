package kyu7;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescribeAListTest {

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals("empty", DescribeAList.describeList(Arrays.asList(new Object[0])));
        assertEquals("singleton", DescribeAList.describeList(Arrays.asList(1)));
        assertEquals("longer", DescribeAList.describeList(Arrays.asList(1,2)));
        assertEquals("empty", DescribeAList.describeList(Arrays.asList(new Object[0])));
        assertEquals("singleton", DescribeAList.describeList(Arrays.asList(1.5)));
        assertEquals("longer", DescribeAList.describeList(Arrays.asList(1.5,2.5)));
    }

}
