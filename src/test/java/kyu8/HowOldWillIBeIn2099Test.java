package kyu8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HowOldWillIBeIn2099Test {

    @Test
    public void testAge() {

        assertEquals("You are 4 years old.", HowOldWillIBeIn2099.CalculateAge(2012, 2016));
        assertEquals("You are 27 years old.", HowOldWillIBeIn2099.CalculateAge(1989, 2016));
        assertEquals("You are 90 years old.", HowOldWillIBeIn2099.CalculateAge(2000, 2090));
        assertEquals("You will be born in 10 years.", HowOldWillIBeIn2099.CalculateAge(2000, 1990));
        assertEquals("You were born this very year!", HowOldWillIBeIn2099.CalculateAge(3400, 3400));
        assertEquals("You are 2000 years old.", HowOldWillIBeIn2099.CalculateAge(900, 2900));
        assertEquals("You will be born in 110 years.", HowOldWillIBeIn2099.CalculateAge(2010, 1900));
        assertEquals("You will be born in 510 years.", HowOldWillIBeIn2099.CalculateAge(2010, 1500));
        assertEquals("You are 1 year old.", HowOldWillIBeIn2099.CalculateAge(2011, 2012));
        assertEquals("You will be born in 1 year.", HowOldWillIBeIn2099.CalculateAge(2000, 1999));

    }

}
