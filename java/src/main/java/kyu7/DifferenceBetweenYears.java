package kyu7;

public class DifferenceBetweenYears {

    public static int howManyYears(String date1, String date2){
        String[] one = date1.split("/");
        String[] two = date2.split("/");
        return Math.abs(Integer.parseInt(one[0]) - Integer.parseInt(two[0]));
    }

}
