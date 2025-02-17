package kyu7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TheOfficeOneOutedTest {

    @Test
    public void basic1() {
        TheOfficeOneOuted.Person[] meet = new TheOfficeOneOuted.Person[]{
                new TheOfficeOneOuted.Person("tim", 0),
                new TheOfficeOneOuted.Person("jim", 2),
                new TheOfficeOneOuted.Person("randy", 0),
                new TheOfficeOneOuted.Person("sandy", 7),
                new TheOfficeOneOuted.Person("andy", 0),
                new TheOfficeOneOuted.Person("katie", 5),
                new TheOfficeOneOuted.Person("laura", 1),
                new TheOfficeOneOuted.Person("saajid", 2),
                new TheOfficeOneOuted.Person("alex", 3),
                new TheOfficeOneOuted.Person("john", 2),
                new TheOfficeOneOuted.Person("mr", 0)
        };
        assertEquals("Get Out Now!", TheOfficeOneOuted.outed(meet, "laura"));
    }

    @Test
    public void basic2() {
        TheOfficeOneOuted.Person[] meet = new TheOfficeOneOuted.Person[]{
                new TheOfficeOneOuted.Person("tim", 1),
                new TheOfficeOneOuted.Person("jim", 3),
                new TheOfficeOneOuted.Person("randy", 9),
                new TheOfficeOneOuted.Person("sandy", 6),
                new TheOfficeOneOuted.Person("andy", 7),
                new TheOfficeOneOuted.Person("katie", 6),
                new TheOfficeOneOuted.Person("laura", 9),
                new TheOfficeOneOuted.Person("saajid", 9),
                new TheOfficeOneOuted.Person("alex", 9),
                new TheOfficeOneOuted.Person("john", 9),
                new TheOfficeOneOuted.Person("mr", 8)
        };
        assertEquals("Nice Work Champ!", TheOfficeOneOuted.outed(meet, "katie"));
    }

    @Test
    public void basic3() {
        TheOfficeOneOuted.Person[] meet = new TheOfficeOneOuted.Person[]{
                new TheOfficeOneOuted.Person("tim", 2),
                new TheOfficeOneOuted.Person("jim", 4),
                new TheOfficeOneOuted.Person("randy", 0),
                new TheOfficeOneOuted.Person("sandy", 5),
                new TheOfficeOneOuted.Person("andy", 8),
                new TheOfficeOneOuted.Person("katie", 6),
                new TheOfficeOneOuted.Person("laura", 2),
                new TheOfficeOneOuted.Person("saajid", 2),
                new TheOfficeOneOuted.Person("alex", 3),
                new TheOfficeOneOuted.Person("john", 2),
                new TheOfficeOneOuted.Person("mr", 8),
        };
        assertEquals("Get Out Now!", TheOfficeOneOuted.outed(meet, "john"));
    }

}
