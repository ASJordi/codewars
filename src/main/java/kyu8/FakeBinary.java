package kyu8;

public class FakeBinary {

    public static String fakeBin(String numberString) {

        String[] numberArray = numberString.split("");
        StringBuilder res = new StringBuilder();

        for (String s : numberArray) {

            if (Integer.parseInt(s) < 5) {
                res.append("0");
                continue;
            }

            if (Integer.parseInt(s) >= 5) {
                res.append("1");
            }
        }

        return res.toString();
        //  return numberString.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");
    }

}
