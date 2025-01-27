package kyu7;

public class AveragesOfNumbers {

    public static double[] averages(int[] numbers) {
        if (numbers == null || numbers.length == 0) return new double[0];
        double[] averages = new double[numbers.length - 1];

        for (int i = 0; i < numbers.length - 1; i++) {
            double avg = (numbers[i] + numbers[i + 1]) / 2.0;
            averages[i] = avg;
        }

        return averages;
    }

}
