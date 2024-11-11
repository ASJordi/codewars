package kyu7;

public class TheOfficeOneOuted {

    public static void main(String[] args) {
        Person[] meet = {
                new Person("tim", 0),
                new Person("jim", 2),
                new Person("randy", 0),
                new Person("sandy", 7),
                new Person("andy", 0),
                new Person("katie", 5),
                new Person("laura", 1),
                new Person("saajid", 2),
                new Person("alex", 3),
                new Person("john", 2),
                new Person("mr", 0)
        };

        String boss = "laura";
        int sum = 0;

        for (Person person : meet) {
            if (person.name.equals(boss)) sum += (person.happiness * 2);
            else sum += person.happiness;
        }

        System.out.println(sum);
    }

    public static String outed(Person[] meet, String boss) {
        double sum = 0;

        for (Person person : meet) {
            if (person.name.equals(boss)) sum += (person.happiness * 2);
            else sum += person.happiness;
        }

        double rating = sum / meet.length;

        return rating <= 5 ? "Get Out Now!" : "Nice Work Champ!";
    }

    public static class Person {
        final String name;
        final int happiness;

        Person(String name, int happiness) {
            this.name = name;
            this.happiness = happiness;
        }
    }
}
