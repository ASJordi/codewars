package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JennysSecretMessageTest {

    @Test
    public void Test() {
        assertEquals("should greet some people normally", "Hello, Jim!", JennysSecretMessage.greet("Jim"));
        assertEquals("should greet some people normally", "Hello, Jane!", JennysSecretMessage.greet("Jane"));
        assertEquals("should greet some people normally", "Hello, Simon!", JennysSecretMessage.greet("Simon"));
        assertEquals("should greet Johnny a little bit more special", "Hello, my love!", JennysSecretMessage.greet("Johnny"));
    }

}
