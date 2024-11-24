package kyu8;

public class CSVRepresentationOfArray {

    public static String toCsvText(int[][] array){
        StringBuilder sb = new StringBuilder();

        for (int[] row : array) {
            for (int i = 0; i < row.length; i++) {
                sb.append(row[i]);
                if (i < row.length - 1) sb.append(",");
            }
            sb.append("\n");
        }

        return sb.toString().trim();
        // return stream(array).map(r -> stream(r).mapToObj(i -> i + "").collect(joining(","))).collect(joining("\n"));
    }

}
