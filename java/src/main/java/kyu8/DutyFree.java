package kyu8;

public class DutyFree {

    public static int dutyFree(int normPrice, int discount, int hol) {

        double save = (double) (normPrice * discount) / 100;

        return (int) (hol / save);

    }

}
