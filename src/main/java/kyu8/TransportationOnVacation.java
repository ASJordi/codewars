package kyu8;

public class TransportationOnVacation {

    public static int rentalCarCost(int d) {
        int totalCost = d * 40;
        return d >= 7 ? totalCost - 50 :
                d >= 3 ? totalCost - 20 : totalCost;
    }

}
