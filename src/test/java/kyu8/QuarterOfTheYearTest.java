package kyu8;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class QuarterOfTheYearTest {

    private final QuarterOfTheYear q = new QuarterOfTheYear();

    @Test
    public void monthBelongsToFirstQuarter() {
        assertThat(q.quarterOf(3)).isEqualTo(1);
    }

    @Test
    public void monthBelongsToSecondQuarter() {
        assertThat(q.quarterOf(6)).isEqualTo(2);
    }

    @Test
    public void monthBelongsToThirdQuarter() {
        assertThat(q.quarterOf(8)).isEqualTo(3);
    }

    @Test
    public void monthBelongsToFourthQuarter() {
        assertThat(q.quarterOf(11)).isEqualTo(4);
    }

}
