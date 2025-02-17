package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindAMeetingRoomTest {

    @Test
    public void basic1() {
        assertEquals(1, FindAMeetingRoom.meeting(new char[]{'X', 'O', 'X'}));
    }

    @Test
    public void basic2() {
        assertEquals(0, FindAMeetingRoom.meeting(new char[]{'O', 'X', 'X', 'X', 'X'}));
    }

    @Test
    public void basic3() {
        assertEquals(2, FindAMeetingRoom.meeting(new char[]{'X', 'X', 'O', 'X', 'X'}));
    }

    @Test
    public void basic4() {
        assertEquals("None available!", FindAMeetingRoom.meeting(new char[]{'X', 'X', 'X', 'X', 'X'}));
    }

}
