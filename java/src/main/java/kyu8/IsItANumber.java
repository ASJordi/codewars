package kyu8;

public class IsItANumber {

    public boolean isDigit(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
