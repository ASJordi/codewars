package kyu7;

public class MoneyMoneyMoney {

    public static int calculateYears(double principal, double interest,  double tax, double desired) {
        int years = 0;
        double currentP = principal;

        while (desired > currentP){
            double i = currentP * interest;
            double t = i * tax;
            currentP += (i - t);
            years++;
        }
        return years;
    }

}
