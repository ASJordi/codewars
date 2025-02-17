package kyu7;

public class BatmanQuotes {

    public static String getQuote(String[] quotes, String hero) {
        StringBuilder quote = new StringBuilder();
        int num = 0;
        for (char c : hero.toCharArray()) if (Character.isDigit(c)) num = Integer.parseInt(Character.toString(c));
        quote.append(hero.startsWith("B") ? "Batman" : hero.startsWith("R") ? "Robin" : "Joker").append(": ").append(quotes[num]);
        return quote.toString();
    }

}
