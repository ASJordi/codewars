package kyu7;

import java.util.function.Function;

public class JavaFunctionalProgrammingTheBeginning {

    public static Function<Student, Boolean> f = (Student s) -> s.getFullName().equals("John Smith") && s.studentNumber.equals("js123");

}

class Student {
    public final String studentNumber;
    private final String firstName;
    private final String lastName;

    public Student(String firstName, String lastName, String studentNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentNumber = studentNumber;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getCommaName() {
        return lastName + ", " + firstName;
    }
}




