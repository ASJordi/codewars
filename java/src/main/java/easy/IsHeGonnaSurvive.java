package easy;

public class IsHeGonnaSurvive {

    public static boolean hero(int bullets, int dragons) {
        return Double.valueOf(dragons) * 2 <= bullets;
        // return bullets / 2 >= dragons;
    }

}
