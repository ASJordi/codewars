package kyu6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AggregateOperations2Test {

    private AggregateOperations2.Student[] students;

    @BeforeEach
    void setUp() {
        AggregateOperations2.Student galina = new AggregateOperations2.Student("Galina", 95, "Philology", AggregateOperations2.Student.Gender.FEMALE);
        AggregateOperations2.Student anton = new AggregateOperations2.Student("Anton", 90, "CS", AggregateOperations2.Student.Gender.MALE);
        AggregateOperations2.Student jack = new AggregateOperations2.Student("Jack", 82, "Philology", AggregateOperations2.Student.Gender.MALE);
        AggregateOperations2.Student mike = new AggregateOperations2.Student("Mike", 60, "Philology", AggregateOperations2.Student.Gender.MALE);
        AggregateOperations2.Student jane = new AggregateOperations2.Student("Jane", 65, "CS", AggregateOperations2.Student.Gender.FEMALE);

        students = new AggregateOperations2.Student[]{galina, anton, jack, mike, jane};
    }

    @Test
    void basicTestGetNumberOfStudentsByDepartment() throws Exception {
        Map<String, Long> actual = AggregateOperations2.getNumberOfStudentsByDepartment(Arrays.stream(students));
        Map<String, Long> expected = new HashMap<>();
        expected.put("CS", 2l);
        expected.put("Philology", 3l);

        assertEquals(expected, actual);
    }

}
