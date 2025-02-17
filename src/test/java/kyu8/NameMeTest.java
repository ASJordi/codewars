package kyu8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class NameMeTest {

    public void testNameMeOne() throws Exception {
        NameMe nameMe = new NameMe("John", "Doe");

        assertEquals("John",
                nameMe.getFirstName(),
                "Verifying First name. Object returned should contain the firstname: John"
        );

        assertEquals("Doe",
                nameMe.getLastName(),
                "Verifying Last name. Object returned should contain the lastname: Doe"
        );

        assertNotEquals("JohnDoe",
                nameMe.getFullName(),
                "Verifying full name. Object returned should contain full name: John Doe"
        );

        assertEquals("John Doe",
                nameMe.getFullName(),
                "Verifying full name. Object returned should contain full name: John Doe"
        );
    }

}
