package kyu6;

public class MultiplicationTable {

    public static int[][] multiplicationTable(int n) {
        int[][] values = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                values[i][j] = (i + 1) * (j + 1);
                if (i != j) values[j][i] = (j + 1) * (i + 1);
            }
        }
        return values;
    }

}
