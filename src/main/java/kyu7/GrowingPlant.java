package kyu7;

public class GrowingPlant {

    public static int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int tall = 0;
        int days = 0;

        while (tall <= desiredHeight) {
            tall += upSpeed;
            days++;
            if (tall >= desiredHeight) break;
            tall -= downSpeed;
        }

        return days;
    }

}
