package kyu7;

import java.util.*;

public class DrivingLicence {

    public static String driver(final String[] data) {
        List<String> months = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        StringBuilder sb = new StringBuilder();

        var year = Integer.parseInt(data[3].substring(data[3].lastIndexOf('-') + 1));
        var month = months.indexOf(data[3].substring(3, 6)) + 1;
        var day = Integer.parseInt(data[3].substring(0, 2));

        var surname = data[2].length() >= 5 ? data[2].substring(0, 5) : data[2] + "9".repeat(5 - data[2].length());
        var decade = year / 10 % 10;
        var monthBirth = data[4].equals("F") ? 50 + month : month < 10 ? "0" + month : month;

        sb.append(surname)
                .append(decade)
                .append(monthBirth)
                .append(day < 10 ? "0" + day : day)
                .append(data[3].charAt(data[3].length() - 1))
                .append(data[0].charAt(0))
                .append(data[1].isBlank() ? "9" : data[1].charAt(0))
                .append("9")
                .append("AA");

        return sb.toString().toUpperCase();
    }

}
