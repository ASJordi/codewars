package kyu6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AggregateOperations3Test {

    private AggregateOperations3.Student[] students;

    @BeforeEach
    void setUp() {
        //Generate a basic array of students:
        AggregateOperations3.Student galina = new AggregateOperations3.Student("Galina", 95, "Philology", AggregateOperations3.Student.Gender.FEMALE);
        AggregateOperations3.Student anton = new AggregateOperations3.Student("Anton", 90, "CS", AggregateOperations3.Student.Gender.MALE);
        AggregateOperations3.Student jack = new AggregateOperations3.Student("Jack", 82, "Philology", AggregateOperations3.Student.Gender.MALE);
        AggregateOperations3.Student mike = new AggregateOperations3.Student("Mike", 60, "Philology", AggregateOperations3.Student.Gender.MALE);
        AggregateOperations3.Student jane = new AggregateOperations3.Student("Jane", 65, "CS", AggregateOperations3.Student.Gender.FEMALE);

        students = new AggregateOperations3.Student[]{galina, anton, jack, mike, jane};
    }

    @Test
    void basicTestGetStudentNamesByDepartment() throws Exception {
        Map<String, List<String>> actual = AggregateOperations3.getStudentNamesByDepartment(Arrays.stream(students));
        List<String> list1 = new ArrayList<>(Arrays.asList("Galina", "Jack", "Mike"));
        List<String> list2 = new ArrayList<>(Arrays.asList("Anton", "Jane"));
        Map<String, List<String>> expected = new HashMap<>();
        expected.put("Philology", list1);
        expected.put("CS", list2);

        assertEquals(expected, actual);
    }

}
