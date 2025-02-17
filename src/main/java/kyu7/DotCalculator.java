package kyu7;

public class DotCalculator {

    public static String calc(String txt) {

        String dot = ".";
        int res = 0;
        txt = txt.replace(" ", "").replace("//", "/");
        String[] nums = txt.split("[-+*/]");

        int numOne = nums[0].length();
        int numTwo = nums[1].length();

        if (txt.contains("+")) res = numOne + numTwo;

        if (txt.contains("-") && (numOne >= numTwo)) res = numOne - numTwo;

        if (txt.contains("*")) res = numOne * numTwo;

        if (txt.contains("/")) res = numOne / numTwo;

        return res > 0 ? dot.repeat(res) : "";

    }

}
