package kyu7;

public class GoStoneScoring {

    public static GameScore determineWinner(char[][] board) {
        int b = 0;
        int w = 0;
        int x = 0;

        for (char[] chars : board) {
            for (char current : chars) {
                if (current == 'B') b++;
                else if (current == 'W') w++;
                else if (current == 'X') x++;
            }
        }

        return b == w ? new GameScore('T', b) : b > w ? new GameScore('B', b) : new GameScore('W', w);
    }

    public record GameScore(char winner, int count) {}

}
