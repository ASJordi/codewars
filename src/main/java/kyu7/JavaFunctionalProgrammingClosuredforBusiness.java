package kyu7;

import java.util.function.IntUnaryOperator;

public class JavaFunctionalProgrammingClosuredforBusiness {

    public static IntUnaryOperator create(int addTo) {
        return o -> o + addTo;
    }

}
