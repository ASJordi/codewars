package kyu7;

public class NthPowerRulesThemAll {

    public static int modifiedSum(int[] array, int power) {
        int sum = 0;
        int sumOfPower = 0;

        for (int num : array) {
            sum += num;
            sumOfPower += Math.pow(num, power);
        }

        return sumOfPower - sum;
    }

}
