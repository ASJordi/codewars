package kyu7;

public class HalvingSum {

    public int halvingSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n;
            n /= 2;
        }

        return sum;
    }

}
