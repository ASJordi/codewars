package kyu8;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StudentsFinalGradeTest {

    @Test
    public void testFixed() {
        assertEquals("Testing with exam = 99 and projects = 1", 100, StudentsFinalGrade.finalGrade(99, 1));
        assertEquals("Testing with exam = 76 and projects = 5", 90, StudentsFinalGrade.finalGrade(76, 5));
        assertEquals("Testing with exam = 76 and projects = 4", 75, StudentsFinalGrade.finalGrade(76, 4));
        assertEquals("Testing with exam = 52 and projects = 1", 0, StudentsFinalGrade.finalGrade(52, 1));
    }

}
