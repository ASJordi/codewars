package kyu6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class PhoneScreenOrganizerTest {

    @Test
    public void FixedTest1() {
        Object[] a = new Object[]{"a"};
        assertArrayEquals(a, PhoneScreenOrganizer.moveOver(a));
    }

    @Test
    public void FixedTest2() {
        Object[] a = new Object[]{null};
        assertArrayEquals(new Object[0], PhoneScreenOrganizer.moveOver(a));
    }

    @Test
    public void FixedTest3() {
        Object[] a = new Object[]{"a"};
        assertArrayEquals(a, PhoneScreenOrganizer.moveOver(new Object[]{null, "a"}));
    }

    @Test
    public void FixedTest4() {
        Object[] a = new Object[]{"b", "a"};
        assertArrayEquals(a, PhoneScreenOrganizer.moveOver(new Object[]{null, "a", "b"}));
    }

}
