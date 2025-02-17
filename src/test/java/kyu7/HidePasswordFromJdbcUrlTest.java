package kyu7;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HidePasswordFromJdbcUrlTest {

    @Test
    public void hidePasswordFromConnection() {
        assertEquals("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****", HidePasswordFromJdbcUrl.hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"));
    }

}
