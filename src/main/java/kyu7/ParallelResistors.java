package kyu7;

public class ParallelResistors {

    public static double resistance(double ... resistors) {
        double sum = 0;

        for (double resistor : resistors) {
            sum += 1 / resistor;
        }

        return 1 / sum;
    }

}
