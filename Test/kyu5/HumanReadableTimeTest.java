package kyu5;

import org.junit.jupiter.api.*;

import java.text.ParseException;

public class HumanReadableTimeTest {
    @Test
    public void Tests() throws ParseException {
        Assertions. assertEquals("00:00:00", HumanReadableTime.makeReadable(0));
        Assertions.assertEquals( "00:00:05", HumanReadableTime.makeReadable(5));
        Assertions.assertEquals("00:01:00", HumanReadableTime.makeReadable(60));
        Assertions.assertEquals( "23:59:59", HumanReadableTime.makeReadable(86399));
        Assertions.assertEquals("99:59:59", HumanReadableTime.makeReadable(359999));
    }
}
