package kyu8;

public class CountingSheep {

    public int countSheeps(Boolean[] arrayOfSheeps) {
        int sum = 0;
        for (Boolean s : arrayOfSheeps) {
            if (s != null && s) sum++;
        }
        return sum;
    }

}
