package kyu7;

public class CalculateMeanAndConcatenateString {

    public static Object[] mean(char[] lst) {
        double sum = 0;
        StringBuilder word = new StringBuilder();

        for (char c : lst){
            if (Character.isDigit(c)) sum += Double.parseDouble(Character.toString(c));
            else word.append(c);
        }

        return new Object[]{sum / 10, word.toString()};
    }

}
