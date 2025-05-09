package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LombokBuilderTest {

    @Test
    public void testSample() {
        LombokBuilder.People person = LombokBuilder.People.builder().name("Adam").lastName("Savage").age(25).city("San Francisco").job("Unchained Reaction").build();
        assertEquals(
                "Adam",
                person.getName()
        );
        assertEquals(
                "hello my name is Adam",
                person.greet()
        );
    }

}