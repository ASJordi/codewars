package kyu7;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzCuckooClockTest {
    
    @Test
    void SomeBasicTimesTests () {
        System.out.println("Testing with time " + "13:34");
        assertEquals("tick", FizzBuzzCuckooClock.fizzBuzzCuckooClock("13:34"));
        System.out.println("Testing with time " + "21:00");
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("21:00"));
        System.out.println("Testing with time " + "11:15");
        assertEquals("Fizz Buzz", FizzBuzzCuckooClock.fizzBuzzCuckooClock("11:15"));
        System.out.println("Testing with time " + "03:03");
        assertEquals("Fizz", FizzBuzzCuckooClock.fizzBuzzCuckooClock("03:03"));
        System.out.println("Testing with time " + "14:30");
        assertEquals("Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("14:30"));
        System.out.println("Testing with time " + "08:55");
        assertEquals("Buzz", FizzBuzzCuckooClock.fizzBuzzCuckooClock("08:55"));
        System.out.println("Testing with time " + "00:00");
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("00:00"));
        System.out.println("Testing with time " + "12:00");
        assertEquals("Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo Cuckoo", FizzBuzzCuckooClock.fizzBuzzCuckooClock("12:00"));
    }

}
