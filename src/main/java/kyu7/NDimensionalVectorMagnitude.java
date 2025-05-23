package kyu7;

public class NDimensionalVectorMagnitude {

    public static double magnitude(double[] vector) {
        double sum = 0;

        for (double v : vector) {
            sum += Math.pow(v, 2);
        }

        return Math.sqrt(sum);
    }

}
