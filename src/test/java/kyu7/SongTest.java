package kyu7;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SongTest {

    Song song = new Song("Mount Moose", "The Snazzy Moose");

    @Test
    public void TestForTitleAndArtist() {
        assertEquals("Mount Moose", song.getTitle(), "Wrong title!");
        assertEquals("The Snazzy Moose", song.getArtist(), "Wrong artist!");
    }

    @Test
    public void TestForDataEncapsulation() {
        assertEquals(0, song.getClass().getFields().length, "Make sure that your attributes are private!\"");
    }

    @Test
    public void TestHowManyMethod() {
        assertEquals(5, song.howMany(new ArrayList<String>(Arrays.asList("John", "Fred", "Bob", "Carl", "RyAn"))));
        assertEquals(2, song.howMany(new ArrayList<String>(Arrays.asList("JoHn", "Luke", "AmAndA"))));
        assertEquals(2, song.howMany(new ArrayList<String>(Arrays.asList("Amanda", "CalEb", "CarL", "Furgus"))));
        assertEquals(1, song.howMany(new ArrayList<String>(Arrays.asList("JOHN", "FRED", "BOB", "CARL", "RYAN", "KATE"))));
        assertEquals(1, song.howMany(new ArrayList<String>(Arrays.asList("Jack", "jacK"))));
    }

}
