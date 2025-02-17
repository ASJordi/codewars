package kyu7;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RockPaperScissorsLizardSpock {

    public static String rpsls(String player1, String player2) {
        Map<String, String[]> rules = new HashMap<>();
        rules.put("rock", new String[]{"scissors", "lizard"});
        rules.put("paper", new String[]{"rock", "spock"});
        rules.put("scissors", new String[]{"paper", "lizard"});
        rules.put("lizard", new String[]{"spock", "paper"});
        rules.put("spock", new String[]{"rock", "scissors"});

        if (player1.equals(player2)) return "Draw!";

        String res = Arrays.toString(rules.get(player1));

        if (res.contains(player2)) return "Player 1 Won!";

        return "Player 2 Won!";
    }

}
