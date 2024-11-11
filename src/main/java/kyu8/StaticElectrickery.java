package kyu8;

public class StaticElectrickery {

    private static int ONE_HUNDRED = 100;

    public static final StaticElectrickery INST = new StaticElectrickery();

    private final int value;

    private StaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

}
