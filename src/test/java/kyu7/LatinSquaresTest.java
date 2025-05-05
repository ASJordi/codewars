package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

class LatinSquaresTest {

    @Test
    void sampleTests() {
        for (int i = 1; i <= 10; i++) {
            int[][] latinSquare = LatinSquares.makeLatinSquare(i);
            Object[] verification = Preloaded.verifyLatinSquare(latinSquare, i);
            boolean result = (boolean) verification[0];
            String message = (String) verification[1];
            assertTrue(result, "n = " + i + " Verifier returned: " + message);
        }
    }

    static class Preloaded {
        static Object[] verifyLatinSquare(int[][] square, int n) {
            boolean isValid = true;
            String message = "Valid Latin Square";
            for (int i = 0; i < n; i++) {
                boolean[] rowCheck = new boolean[n];
                boolean[] colCheck = new boolean[n];
                for (int j = 0; j < n; j++) {
                    if (square[i][j] < 1 || square[i][j] > n || rowCheck[square[i][j] - 1]) {
                        isValid = false;
                        message = "Invalid row at index " + i;
                    }
                    if (square[j][i] < 1 || square[j][i] > n || colCheck[square[j][i] - 1]) {
                        isValid = false;
                        message = "Invalid column at index " + i;
                    }
                    rowCheck[square[i][j] - 1] = true;
                    colCheck[square[j][i] - 1] = true;
                }
            }
            return new Object[]{isValid, message};
        }
    }

}
