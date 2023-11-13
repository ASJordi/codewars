package kyu8;

public class SharkPontoon {

    public static String shark(int pontoonDistance, int sharkDistance, int youSpeed, int sharkSpeed, boolean dolphin) {
        if (dolphin) sharkSpeed = sharkSpeed / 2;

        double timeSharkToPontoon = sharkDistance / sharkSpeed;
        double timeYouToPontoon = pontoonDistance / youSpeed;

        return timeYouToPontoon < timeSharkToPontoon ? "Alive!" : "Shark Bait!";
    }

}
