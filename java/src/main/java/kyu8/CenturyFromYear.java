package kyu8;

public class CenturyFromYear {

    public static int century(int number) {
        int century = number / 100;
        return (number % 100 != 0) ? century + 1 : century;
    }

}
