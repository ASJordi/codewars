package kyu8;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayingWithCubesIITest {

    @Test
    @Order(1)
    @DisplayName("Test default constructor: side should be 0")
    public void defaultConstructor() {
        PlayingWithCubesII c = new PlayingWithCubesII();
        assertEquals(0, c.getSide());
    }

    @Test
    @Order(2)
    @DisplayName("Test default constructor: positive side")
    public void constructor_positiveSide() {
        PlayingWithCubesII c = new PlayingWithCubesII(6);
        assertEquals(6, c.getSide());
    }

    @Test
    @Order(3)
    @DisplayName("Test default constructor: negative side")
    public void constructor_negativeSide() {
        PlayingWithCubesII c = new PlayingWithCubesII(-3);
        assertEquals(3, c.getSide());
    }

    @Test
    @Order(4)
    @DisplayName("Test setter: positive side")
    public void setter_positiveSide() {
        PlayingWithCubesII c = new PlayingWithCubesII();
        c.setSide(3);
        assertEquals(3, c.getSide());
    }

    @Test
    @Order(5)
    @DisplayName("Test setter: zero side")
    public void setter_zeroSide() {
        PlayingWithCubesII c = new PlayingWithCubesII(42);
        c.setSide(0);
        assertEquals(0, c.getSide());
    }

    @Test
    @Order(6)
    @DisplayName("Test setter: negative side")
    public void setter_negativeSide() {
        PlayingWithCubesII c = new PlayingWithCubesII(-42);
        c.setSide(-1337);
        assertEquals(1337, c.getSide());
    }

}
