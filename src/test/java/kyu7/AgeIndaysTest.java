package kyu7;

import java.time.LocalDate;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgeIndaysTest {

    @Test
    public void ageInDaysShouldReturnYouAre2DaysOldWhenYourBirthdayIsTwoDaysAgo() {
        LocalDate birthday = LocalDate.now().minusDays(2);
        assertEquals("You are 2 days old",
                AgeIndays.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
    }

    @Test
    public void ageInDaysShouldReturnCorrectNumberOfDaysWhenYourBirthdayIsOneYearAgo() {
        LocalDate birthday = LocalDate.now().minusYears(1);
        if (LocalDate.now().isLeapYear()) {
            assertEquals("You are 366 days old",
                    AgeIndays.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
        } else {
            assertEquals("You are 365 days old",
                    AgeIndays.ageInDays(birthday.getYear(), birthday.getMonthValue(), birthday.getDayOfMonth()));
        }
    }

}
