package kyu8;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


public class QuadrantTest {

    private final Quadrant q = new Quadrant();

    @Test
    public void quadrantShouldBeFirst() {
        assertThat(q.quadrant(1, 2)).isEqualTo(1);
        assertThat(q.quadrant(3, 5)).isEqualTo(1);
    }

    @Test
    public void quadrantShouldBeSecond() {
        assertThat(q.quadrant(-10, 100)).isEqualTo(2);
    }

    @Test
    public void quadrantShouldBeThird() {
        assertThat(q.quadrant(-1, -9)).isEqualTo(3);
    }

    @Test
    public void quadrantShouldBeFourth() {
        assertThat(q.quadrant(19, -56)).isEqualTo(4);
    }

    @Test
    public void bothParametersShouldNotBeZero() {
        assertThatThrownBy(() -> q.quadrant(0, 0))
            .isInstanceOf(IllegalArgumentException.class)
            .hasMessage("x and y cannot be 0");
    }
}
