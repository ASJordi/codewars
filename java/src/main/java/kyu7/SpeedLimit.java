package kyu7;

public class SpeedLimit {

    public static int speedLimit(final int speed, final int[] signals) {
        int amount  = 0;

        for (int limit : signals){
            if (speed > limit){
                int diff = speed - limit;
                if (diff >= 10 && diff <= 19) amount += 100;
                if (diff > 19 && diff <= 29) amount += 250;
                if (diff >= 30) amount += 500;
            }
        }

        return amount;
    }

}
