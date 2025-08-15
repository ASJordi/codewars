package kyu6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AggregateOperations1Test {

    private AggregateOperations1.Student[] students;

    @BeforeEach
    void setUp() {
        //Generate a basic array of students:
        AggregateOperations1.Student galina = new AggregateOperations1.Student("Galina", 95, "Philology", AggregateOperations1.Student.Gender.FEMALE);
        AggregateOperations1.Student anton = new AggregateOperations1.Student("Anton", 90, "CS", AggregateOperations1.Student.Gender.MALE);
        AggregateOperations1.Student jack = new AggregateOperations1.Student("Jack", 82, "Philology", AggregateOperations1.Student.Gender.MALE);
        AggregateOperations1.Student mike = new AggregateOperations1.Student("Mike", 60, "Philology", AggregateOperations1.Student.Gender.MALE);
        AggregateOperations1.Student jane = new AggregateOperations1.Student("Jane", 65, "CS", AggregateOperations1.Student.Gender.FEMALE);

        students = new AggregateOperations1.Student[]{galina, anton, jack, mike, jane};
    }

    @Test
    void basicTestGetAverageGradeByDepartment() {

        Map<String, Double> actual = AggregateOperations1.getAverageGradeByDepartment(Arrays.stream(students));
        Map<String, Double> expected = new HashMap<>();
        expected.put("CS", 77.5);
        expected.put("Philology", 79.0);

        assertEqualsWithTolerance(expected, actual);

    }

    void assertEqualsWithTolerance(Map<String, Double> expected, Map<String, Double> actual) {

        assertEquals(expected.size(), actual.size(), "The size of the returned map is incorrect");

        for (var entry : expected.entrySet()) {

            var key = entry.getKey();
            var value = entry.getValue();

            assertEquals(true, actual.containsKey(key), String.format("Key '%s' does not exist in the returned map", key));

            var actualValue = actual.get(key);

            assertEquals(true, Math.abs(actualValue - value) < 1e-6,
                    String.format("Returned Value %f is incorrect for key '%s': expected value %f", actualValue, key, value));
        }

    }

}
