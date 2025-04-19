package kyu7;

public class HelpSuzukiRakeHisGarden {

    public static String rakeGarden(String garden) {
        StringBuilder res = new StringBuilder();

        for (String item : garden.split(" ")) {
            if (item.equals("rock") || item.equals("gravel")) res.append(item).append(" ");
            else res.append("gravel").append(" ");
        }

        return res.toString().trim();
    }

}
