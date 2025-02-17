package kyu6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyFriendTimeTest {

    @Test
    public void sampleTests() {
        assertEquals("27-03-2021 21:41", MyFriendTime.getFriendDateAndTime("27-03-2021 19:41", "Europe/Warsaw", "Africa/Asmera"));
        assertEquals("28-03-2021 05:41", MyFriendTime.getFriendDateAndTime("27-03-2021 19:41", "Europe/Warsaw", "Australia/Sydney"));
        assertEquals("28-03-2021 10:41", MyFriendTime.getFriendDateAndTime("28-03-2021 19:41", "Australia/Sydney", "Europe/Warsaw"));
        assertEquals("19-03-2021 12:01", MyFriendTime.getFriendDateAndTime("19-03-2021 01:01", "America/Halifax", "Asia/Makassar"));
        assertEquals("01-12-2021 00:00", MyFriendTime.getFriendDateAndTime("01-12-2021 00:00", "Europe/Dublin", "Europe/Belfast"));
//        assertEquals("07-12-2021 11:59", MyFriendTime.getFriendDateAndTime("07-12-2021 23:59", "Pacific/Fiji", "Europe/Berlin"));
    }

}
