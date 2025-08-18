package kyu6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AggregateOperations4Test {

    private AggregateOperations4.Student[] students;

    @BeforeEach
    void setUp() {
        //Generate a basic array of students:
        AggregateOperations4.Student galina = new AggregateOperations4.Student("Galina", 95, "Philology", AggregateOperations4.Student.Gender.FEMALE);
        AggregateOperations4.Student anton = new AggregateOperations4.Student("Anton", 90, "CS", AggregateOperations4.Student.Gender.MALE);
        AggregateOperations4.Student jack = new AggregateOperations4.Student("Jack", 82, "Philology", AggregateOperations4.Student.Gender.MALE);
        AggregateOperations4.Student mike = new AggregateOperations4.Student("Mike", 60, "Philology", AggregateOperations4.Student.Gender.MALE);
        AggregateOperations4.Student jane = new AggregateOperations4.Student("Jane", 65, "CS", AggregateOperations4.Student.Gender.FEMALE);

        students = new AggregateOperations4.Student[]{galina, anton, jack, mike, jane};
    }

    @Test
    void basicTestGetTheNumberOfStudentsByGenderForEachDepartment() throws Exception {
        Map<String, Map<AggregateOperations4.Student.Gender, Long>> actual = AggregateOperations4.getTheNumberOfStudentsByGenderForEachDepartment(Arrays.stream(students));
        Map<String, Map<AggregateOperations4.Student.Gender, Long>> expected = new HashMap<>();
        Map<AggregateOperations4.Student.Gender, Long> map1 = new HashMap<>();
        Map<AggregateOperations4.Student.Gender, Long> map2 = new HashMap<>();
        map1.put(AggregateOperations4.Student.Gender.MALE, 1L);
        map1.put(AggregateOperations4.Student.Gender.FEMALE, 1L);
        map2.put(AggregateOperations4.Student.Gender.MALE, 2L);
        map2.put(AggregateOperations4.Student.Gender.FEMALE, 1L);
        expected.put("CS", map1);
        expected.put("Philology", map2);

        assertEquals(expected, actual);
    }
    
}
