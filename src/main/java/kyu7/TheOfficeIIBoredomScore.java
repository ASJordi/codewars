package kyu7;

public class TheOfficeIIBoredomScore {

    public static String boredom(Person[] staff) {
        int score = 0;

        for (Person person : staff) {
            switch (person.department) {
                case "accounts" -> score += 1;
                case "finance" -> score += 2;
                case "canteen" -> score += 10;
                case "regulation" -> score += 3;
                case "trading" -> score += 6;
                case "change" -> score += 6;
                case "IS" -> score += 8;
                case "retail" -> score += 5;
                case "cleaning" -> score += 4;
                case "pissing about" -> score += 25;
            }
        }


        return score <= 80 ? "kill me now" :
                (score < 100 && score > 80) ? "i can handle this" : "party time!!";
    }

    record Person(String name, String department) {}

}
