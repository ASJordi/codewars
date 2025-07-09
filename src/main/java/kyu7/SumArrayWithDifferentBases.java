package kyu7;

public class SumArrayWithDifferentBases {

    public static long sumItUp(BasedNumbers[] numbersWithBases) {
        long sum = 0;

        for (var i : numbersWithBases) {
            sum += Long.parseLong(i.number, i.base);
        }

        return sum;
    }

    static class BasedNumbers{
        String number;
        int base;

        public BasedNumbers(String number, int base) {
            this.number = number;
            this.base = base;
        }
    }

}
