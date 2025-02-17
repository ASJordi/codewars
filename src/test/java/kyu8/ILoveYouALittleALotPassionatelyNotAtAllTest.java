package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ILoveYouALittleALotPassionatelyNotAtAllTest {

    @Test
    public void test1() {
        assertEquals("I love you", ILoveYouALittleALotPassionatelyNotAtAll.howMuchILoveYou(1));
        assertEquals("a little", ILoveYouALittleALotPassionatelyNotAtAll.howMuchILoveYou(2));
        assertEquals("not at all", ILoveYouALittleALotPassionatelyNotAtAll.howMuchILoveYou(6));
    }

}
