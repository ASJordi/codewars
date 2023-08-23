package kyu7;

public class PrinterErrors {

    public static String printerError(String s) {
        StringBuilder res = new StringBuilder();
        String colors = "abcdefghijklm";
        int errors = 0;

        for (char c : s.toCharArray()) if (!colors.contains(String.valueOf(c))) errors++;

        res.append(errors).append("/").append(s.length());
        return res.toString();
//        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }

}
