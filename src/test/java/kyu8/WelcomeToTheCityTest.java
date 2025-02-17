package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WelcomeToTheCityTest {

    @Test
    public void test1() throws Exception {
        WelcomeToTheCity h = new WelcomeToTheCity();
        String[] name = {"John", "Smith"};
        assertEquals("Hello, John Smith! Welcome to Phoenix, Arizona!",
                h.sayHello(name, "Phoenix", "Arizona"));
    }

}
