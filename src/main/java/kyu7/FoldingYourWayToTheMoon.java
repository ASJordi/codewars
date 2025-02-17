package kyu7;

public class FoldingYourWayToTheMoon {

    public static Long fold(Double distance) {
        if (distance < 0) return null;

        double thickness = 0.0001D;
        long times = 0L;

        while (thickness < distance) {
            times++;
            thickness *= 2;
        }

        return times;
    }

}
