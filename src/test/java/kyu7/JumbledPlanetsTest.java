package kyu7;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class JumbledPlanetsTest {

    JumbledPlanets ss;

    @BeforeEach
    void setUp() throws Exception {
        ss = new JumbledPlanets();
    }

    @AfterEach
    void tearDown() throws Exception {
        ss = null;
    }

    @DisplayName("Sample Test 1")
    @Test
    void test1() {
        String[] bodies = { "Mars", "Asteroid", "Venus", "Jupiter", "Asteroid", "Earth", "Pluto" };
        assertArrayEquals(new char[] { '<', '>', '>', '<', '>', '<' }, ss.annotate(bodies));
    }

    @DisplayName("Sample Test 2")
    @Test
    void test2() {
        String[] bodies = { "Asteroid", "Asteroid", "Asteroid", "Earth", "Jupiter" };
        assertArrayEquals(new char[] { '=', '=', '>', '>' }, ss.annotate(bodies));
    }

    @DisplayName("Sample Test 3")
    @Test
    void test3() {
        String[] bodies = { "Mercury", "Venus", "Earth", "Mars", "Asteroid", "Jupiter", "Saturn", "Uranus",
                "Neptune", "Asteroid", "Pluto" };
        assertArrayEquals(new char[] { '>', '>', '<', '<', '>', '<', '<', '<', '<', '>' },
                ss.annotate(bodies));
    }

    @DisplayName("Sample Test 4")
    @Test
    void test4() {
        String[] bodies = {};
        assertArrayEquals(new char[0], ss.annotate(bodies));
    }

}
