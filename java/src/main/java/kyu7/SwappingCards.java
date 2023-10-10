package kyu7;

public class SwappingCards {

    public static boolean swapCards(int n1, int n2) {
        String paulNumber = String.valueOf(n1);
        String opponentNumber = String.valueOf(n2);

        int min = Math.min(Integer.parseInt(String.valueOf(paulNumber.charAt(0))), Integer.parseInt(String.valueOf(paulNumber.charAt(1))));
        int index = paulNumber.indexOf(String.valueOf(min));

        paulNumber = paulNumber.replace(paulNumber.charAt(index), opponentNumber.charAt(0));
        opponentNumber = opponentNumber.replace(opponentNumber.charAt(0), String.valueOf(min).charAt(0));

        return Integer.parseInt(paulNumber) > Integer.parseInt(opponentNumber);
    }

}
