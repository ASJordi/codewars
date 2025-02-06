package kyu7;

public class EmailAddressObfuscator {

    public static String obfuscate(String email) {
        return email.replace("@", " [at] ").replace(".", " [dot] ").trim();
    }

}
