package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class InviteMoreWomenTest {

    @Test
    public void basicTests() {
        assertEquals(true, InviteMoreWomen.inviteMoreWomen(new int[] {1, -1, 1}));
        assertEquals(false, InviteMoreWomen.inviteMoreWomen(new int[] {-1, -1, -1}));
        assertEquals(false, InviteMoreWomen.inviteMoreWomen(new int[] {1, -1}));
        assertEquals(true, InviteMoreWomen.inviteMoreWomen(new int[] {1, 1, 1}));
    }

}
