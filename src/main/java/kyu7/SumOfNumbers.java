package kyu7;

public class SumOfNumbers {

    public int GetSum(int a, int b) {
        if (b == a) return a;
        int sum = 0;

        for (int i = Math.min(a, b); i <= Math.max(a, b) ; i++) {
            sum += i;
        }

        return sum;
//        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }

}
