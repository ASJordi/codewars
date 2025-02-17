package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoveAllExclamationMarksFromTheEndOfWordsTest {

    @Test
    public void testBasic() {
        assertEquals("nothing to do", RemoveAllExclamationMarksFromTheEndOfWords.removeBang("nothing to do"));
        assertEquals("No seriously Seriously Wow", RemoveAllExclamationMarksFromTheEndOfWords.removeBang("No seriously! Seriously!! Wow"));
        assertEquals("!!No seriously !Seriously !!Wow", RemoveAllExclamationMarksFromTheEndOfWords.removeBang("!!No! seriously! !Seriously!! !!Wow!"));
    }

}
