package kyu7;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DescribeAListTest {

    @Test
    public void examples() {
        // assertEquals("expected", "actual");
        assertEquals("empty", DescribeAList.describeList(List.of()));
        assertEquals("singleton", DescribeAList.describeList(List.of(1)));
        assertEquals("longer", DescribeAList.describeList(Arrays.asList(1, 2)));
        assertEquals("empty", DescribeAList.describeList(List.of()));
        assertEquals("singleton", DescribeAList.describeList(List.of(1.5)));
        assertEquals("longer", DescribeAList.describeList(Arrays.asList(1.5, 2.5)));
    }

}
