package kyu7;

public class Quicksum {

    public int quicksum(String packet) {
        if (!packet.matches("[A-Z ]+")) return 0;

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int sum = 0;

        for (int i = 0; i < packet.length(); i++) {
            int posAlp = alphabet.indexOf(packet.charAt(i)) + 1;
            int index = i + 1;
            sum += (posAlp * index);
        }

        return sum;
    }

}
