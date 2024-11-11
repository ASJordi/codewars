package kyu8;

public class RemoveTheTime {

    public static String shortenToDate(String longDate) {

        String[] dateArr = longDate.replace(",", "").split(" ");

        return dateArr[0] + " " + dateArr[1] + " " + dateArr[2];
//        return longDate.substring(0, longDate.indexOf(','));
    }

}
