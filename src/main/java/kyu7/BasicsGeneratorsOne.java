package kyu7;

public class BasicsGeneratorsOne {

    private int num = 0;

    public int next() {
        this.num++;
        return this.num;
    }

    public int next(int n) {
        this.num = n;
        return this.num;
    }

}
