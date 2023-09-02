package kyu7;

public class DecimalDecomposition { //Decimal decomposition

    public static String decimalDecomposition(int number){
        int mod = 10;

        StringBuilder decomposition = new StringBuilder();

        while(number > 0) {

            if(number % mod != 0) {
                decomposition.insert(0, (number % mod));
                number -= number % mod;

                if(number != 0) {
                    decomposition.insert(0, "+");
                }
            }

            mod *= 10;
        }

        return decomposition.toString();
    }

}
