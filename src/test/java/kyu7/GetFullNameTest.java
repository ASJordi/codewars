package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetFullNameTest {

    @Test
    public void test() {
        assertEquals("Clint Eastwood", new GetFullName("Clint", "Eastwood").getFullName());
    }

}
