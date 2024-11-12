package kyu7;

public class ATM {

    public int solve(int n) {
        int[] banknotes= {500, 200, 100, 50, 20, 10};
        int t = 0;

        for (int b : banknotes) {
            t += n / b;
            n %= b;
        }
        return n == 0 ? t : -1;
    }

}
