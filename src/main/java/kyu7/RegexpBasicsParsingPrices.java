package kyu7;

public class RegexpBasicsParsingPrices {

    public static Integer toCents(String price) {
        return price.matches("\\$\\d+\\.\\d{2}") ? Integer.parseInt(price.replaceAll("[$.]", "")) : null;
    }

}
