package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

class ClassyExtentionsTest {

    @Test
    void mrWhiskers() {
        ClassyExtentions.Cat cat = new ClassyExtentions.Cat("Mr Whiskers");
        assertEquals("Mr Whiskers meows.", cat.speak());
        assertInstanceOf(ClassyExtentions.Animal.class, cat, "Your Cat class should extend Animal");
    }

    @Test
    void lamp() {
        ClassyExtentions.Cat cat = new ClassyExtentions.Cat("Lamp");
        assertEquals("Lamp meows.", cat.speak());
    }

    @Test
    void moneyBags() {
        ClassyExtentions.Cat cat = new ClassyExtentions.Cat("$$Money Bags$$");
        assertEquals("$$Money Bags$$ meows.", cat.speak());
    }

}
