package easy;

import java.util.HashMap;
import java.util.Map;

public class RockPaperScissors {

    public static String rps(String p1, String p2) {

        Map<String, String> rules = new HashMap<>();
        rules.put("rock", "scissors");
        rules.put("paper", "rock");
        rules.put("scissors", "paper");

        return p1.equals(p2) ? "Draw!" :
                rules.get(p1) == p2 ? "Player 1 won!" :
                        "Player 2 won!";

    }

}
