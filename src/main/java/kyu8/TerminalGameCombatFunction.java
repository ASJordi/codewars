package kyu8;

public class TerminalGameCombatFunction {

    public static int combat(int health, int damage) {
        return health - damage < 0 ? 0 : health - damage;
    }

}
