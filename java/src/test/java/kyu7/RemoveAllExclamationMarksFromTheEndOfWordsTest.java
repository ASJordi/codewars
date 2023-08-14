package kyu7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveAllExclamationMarksFromTheEndOfWordsTest {

    @Test
    public void testBasic() {
        assertEquals("nothing to do", RemoveAllExclamationMarksFromTheEndOfWords.removeBang("nothing to do"));
        assertEquals("should remove bangs from the end of words", "No seriously Seriously Wow", RemoveAllExclamationMarksFromTheEndOfWords.removeBang("No seriously! Seriously!! Wow"));
        assertEquals("should remove bangs from the end of words only", "!!No seriously !Seriously !!Wow", RemoveAllExclamationMarksFromTheEndOfWords.removeBang("!!No! seriously! !Seriously!! !!Wow!"));
    }

}
