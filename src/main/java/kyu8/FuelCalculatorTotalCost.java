package kyu8;

public class FuelCalculatorTotalCost {

    public static void main(String[] args) {
        int litres = 5;
        double pricePerLitre = 1.23d;


    }

    public static double fuelPrice(int litres, double pricePerLitre) {

        int discountStep = 2;
        double maxDiscount = 0.25;

        double totalCost = litres * pricePerLitre;
        int discount = litres / discountStep;
        double discountPerLitre = Math.min(discount * 0.05, maxDiscount);

        totalCost -= discountPerLitre * litres;

        return Math.round(totalCost * 100) / 100.0;

    }

}
