package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoStoneScoringTest {

    @Test
    public void testDetermineWinnerExampleBoard1() {
        char[][] board = new char[][] {
                { 'W', 'W', 'W', 'B', 'B', 'B' },
                { 'W', 'W', 'W', 'W', 'B', 'B' },
                { 'W', 'W', 'W', 'B', 'B', 'B' },
                { 'W', 'X', 'W', 'B', 'B', 'B' },
                { 'X', 'W', 'B', 'B', 'B', 'B' },
                { 'W', 'W', 'B', 'X', 'B', 'X' }
        };

        GoStoneScoring.GameScore result = GoStoneScoring.determineWinner(board);
        assertEquals(new GoStoneScoring.GameScore('B', 17), result);  // Expected result: black wins with 17 stones
    }

}
