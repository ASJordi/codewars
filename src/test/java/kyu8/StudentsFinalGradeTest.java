package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentsFinalGradeTest {

    @Test
    public void testFixed() {
        assertEquals(100, StudentsFinalGrade.finalGrade(99, 1), "Testing with exam = 99 and projects = 1");
        assertEquals(90, StudentsFinalGrade.finalGrade(76, 5), "Testing with exam = 76 and projects = 5");
        assertEquals(75, StudentsFinalGrade.finalGrade(76, 4), "Testing with exam = 76 and projects = 4");
        assertEquals(0, StudentsFinalGrade.finalGrade(52, 1), "Testing with exam = 52 and projects = 1");
    }

}
