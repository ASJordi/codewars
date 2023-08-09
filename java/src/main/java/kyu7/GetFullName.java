package kyu7;

public class GetFullName {

    private final String firstName;
    private final String lastName;

    public GetFullName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return (this.firstName + " " + this.lastName).trim();
    }

}
