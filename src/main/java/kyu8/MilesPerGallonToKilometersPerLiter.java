package kyu8;

public class MilesPerGallonToKilometersPerLiter {

    public static float mpgToKPM(final float mpg) {
        final float MILES_TO_KILOMETERS = 1.609344f;
        final float GALLONS_TO_LITRES = 4.54609188f;

        float kilometersPerLiter = mpg * MILES_TO_KILOMETERS / GALLONS_TO_LITRES;
        return Math.round(kilometersPerLiter * 100) / 100.0f;
    }

}
