package kyu7;

public class SelectiveFearOfnumbers {

    static boolean AmIAfraid(final String day, final int num) {
        return switch (day) {
            case "Monday" -> num == 12;
            case "Tuesday" -> num > 95;
            case "Wednesday" -> num == 34;
            case "Thursday" -> num == 0;
            case "Friday" -> num % 2 == 0;
            case "Saturday" -> num == 56;
            case "Sunday" -> Math.abs(num) == 666;
            default -> false;
        };
    }

}
