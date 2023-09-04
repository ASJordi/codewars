package kyu7;

public class MultiplicationGeneratorsTwo {

    private final int a;
    private int num = 0;

    private MultiplicationGeneratorsTwo(int a) {
        this.a = a;
    }

    public static MultiplicationGeneratorsTwo of(int a) {
        return new MultiplicationGeneratorsTwo(a);
    }

    public String next() {
        this.num++;
        return new StringBuilder().append(this.a).append(" x ").append(this.num).append(" = ").append(this.num * this.a).toString();
    }

}
