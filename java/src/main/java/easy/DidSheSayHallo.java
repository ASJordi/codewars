package easy;

public class DidSheSayHallo {

    public static boolean validateHello(String greetings){

        String lowerCaseGreetings = greetings.toLowerCase();
        return lowerCaseGreetings.contains("hello") ||
                lowerCaseGreetings.contains("ciao") ||
                lowerCaseGreetings.contains("salut") ||
                lowerCaseGreetings.contains("hallo") ||
                lowerCaseGreetings.contains("hola") ||
                lowerCaseGreetings.contains("ahoj") ||
                lowerCaseGreetings.contains("czesc");
    }

}
