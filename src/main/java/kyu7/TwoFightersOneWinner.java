package kyu7;

public class TwoFightersOneWinner { // Two fighters, one winner.

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        while (fighter1.health > 0 && fighter2.health > 0) {
            if (firstAttacker.equals(fighter1.name)) fighter2.health -= fighter1.damagePerAttack;
            else fighter1.health -= fighter2.damagePerAttack;
            firstAttacker = firstAttacker.equals(fighter1.name) ? fighter2.name : fighter1.name;
        }

        return fighter1.health > 0 ? fighter1.name : fighter2.name;
    }

    static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

}
