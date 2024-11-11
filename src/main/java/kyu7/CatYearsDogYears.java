package kyu7;

public class CatYearsDogYears {

    public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
        int ownedCat = 0;
        int ownedDog = 0;

        if (catYears % 15 == 0) ownedCat++;
        else if (catYears % 24 == 0) ownedCat += 2;

        if (dogYears % 15 == 0) ownedDog++;
        else if (dogYears % 24 == 0) ownedDog += 2;

        if (catYears > 24) ownedCat = ((catYears - 24) / 4) + 2;
        if (dogYears > 24) ownedDog = ((dogYears - 24) / 5) + 2;

        return new int[]{ownedCat, ownedDog};
    }

}
