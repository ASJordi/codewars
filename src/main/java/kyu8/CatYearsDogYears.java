package kyu8;

public class CatYearsDogYears {

    public static void main(String[] args) {

        final int humanYears = 10;
        int catYears = 0;
        int dogYears = 0;
        // {10,56,64} human cat dogs

        for (int i = 1; i <= humanYears; i++) {
            if (i == 1) {
                catYears += 15;
                dogYears += 15;
                continue;
            }
            if (i == 2) {
                catYears += 9;
                dogYears += 9;
                continue;
            }

            catYears += 4;
            dogYears += 5;
        }

        System.out.println(catYears);
        System.out.println(dogYears);


    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {

        int catYears = 0;
        int dogYears = 0;

        for (int i = 1; i <= humanYears; i++) {

            if (i == 1) {
                catYears += 15;
                dogYears += 15;
                continue;
            }

            if (i == 2) {
                catYears += 9;
                dogYears += 9;
                continue;
            }

            catYears += 4;
            dogYears += 5;
        }

        return new int[]{humanYears, catYears, dogYears};
    }

}
