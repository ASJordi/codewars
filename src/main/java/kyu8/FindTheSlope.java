package kyu8;

public class FindTheSlope {

    public String slope(int[] points) {
        int y = points[3] - points[1];
        int x = points[2] - points[0];

        return x != 0 ? String.valueOf(y / x) : "undefined";
    }
}
