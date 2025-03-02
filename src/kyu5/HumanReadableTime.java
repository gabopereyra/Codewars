//LEVEL: kyu 5
//link: https://www.codewars.com/kata/52685f7382004e774f0001f7/train/java

/*DESCRIPTION
Write a function, which takes a non-negative integer (seconds) as input and returns the time in a human-readable format (HH:MM:SS)

    HH = hours, padded to 2 digits, range: 00 - 99
    MM = minutes, padded to 2 digits, range: 00 - 59
    SS = seconds, padded to 2 digits, range: 00 - 59

The maximum time never exceeds 359999 (99:59:59)

You can find some examples in the test fixtures.

 */

package kyu5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
      return String.format("%02d:%02d:%02d", seconds / 3600, (seconds / 60) % 60, seconds % 60);
    }

    @Test
    public void Tests(){
        Assertions.assertEquals("00:00:00", makeReadable(0));
        Assertions.assertEquals( "00:00:05", makeReadable(5));
        Assertions.assertEquals("00:01:00", makeReadable(60));
        Assertions.assertEquals( "23:59:59", makeReadable(86399));
        Assertions.assertEquals("99:59:59", makeReadable(359999));
    }
}
