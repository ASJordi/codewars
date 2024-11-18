package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraderTest {

    @Test
    public void sampleTests(){
        assertEquals("C", Grader.grader(0.7));
        assertEquals("A", Grader.grader(0.9));
        assertEquals("D", Grader.grader(0.6));
        assertEquals("1.1 is greater than 1 the grade should be \"F\"", "F", Grader.grader(1.1));
    }

}
