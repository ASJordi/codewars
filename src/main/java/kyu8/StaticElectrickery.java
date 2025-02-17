package kyu8;

public class StaticElectrickery {

    public static final StaticElectrickery INST = new StaticElectrickery();
    private static final int ONE_HUNDRED = 100;
    private final int value;

    private StaticElectrickery() {
        value = ONE_HUNDRED;
    }

    public int plus100(int n) {
        return value + n;
    }

}
