package kyu7;

public class InvisibleCubes {

    public Long notVisibleCubes(Long n) {
        return n <= 2 ? 0 : (long) Math.pow(n - 2, 3);
    }

}
