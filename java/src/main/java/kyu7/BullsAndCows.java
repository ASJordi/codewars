package kyu7;

public class BullsAndCows {

    private final String secretNumber;
    private int attempts;

    public BullsAndCows(int secret) {
        this.secretNumber = validateNumber(secret);
    }

    public String compareWith(int n) {
        if (this.attempts == -1) return "You already won!";
        if (this.attempts > 7) return "Sorry, you're out of turns!";

        String num = validateNumber(n);
        if (this.secretNumber.equals(num)) {
            this.attempts = -1;
            return "You win!";
        }

        this.attempts++;
        int b = 0;
        int c = 0;
        StringBuilder msg = new StringBuilder();

        for (int i = 0; i < num.length(); i++) {
            char currUser = num.charAt(i);
            char currSecret = this.secretNumber.charAt(i);

            if (currUser == currSecret) b++;
            else if (this.secretNumber.contains(Character.toString(currUser))) c++;
        }

        msg.append(b).append(" ").append(b == 1 ? "bull" : "bulls").append(" and ");
        msg.append(c).append(" ").append(c == 1 ? "cow" : "cows");

        return msg.toString();
    }

    private String validateNumber(int n) {
        if (n < 1000 || n > 9999 || ("" + n).chars().distinct().count() != 4) throw new IllegalArgumentException();
        return "" + n;
    }
}
