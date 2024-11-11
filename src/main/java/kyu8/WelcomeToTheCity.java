package kyu8;

public class WelcomeToTheCity {

    public String sayHello(String [] name, String city, String state){

        String completeName = String.join(" ", name);
        return String.format("Hello, %s! Welcome to %s, %s!", completeName, city, state);

    }

}
