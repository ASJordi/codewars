package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JennysSecretMessageTest {

    @Test
    public void Test() {
        assertEquals("Hello, Jim!", JennysSecretMessage.greet("Jim"));
        assertEquals("Hello, Jane!", JennysSecretMessage.greet("Jane"));
        assertEquals("Hello, Simon!", JennysSecretMessage.greet("Simon"));
        assertEquals("Hello, my love!", JennysSecretMessage.greet("Johnny"));
    }

}
