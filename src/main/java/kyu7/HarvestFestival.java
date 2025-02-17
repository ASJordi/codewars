package kyu7;

public class HarvestFestival {

    public static String plant(char seed, int water, int fert, int temp) {
        if (temp < 20 || temp > 30) fert = 0;
        return ("-".repeat(water) + ("" + seed).repeat(fert)).repeat(water) + (fert > 0 ? "" : seed);
    }

}
