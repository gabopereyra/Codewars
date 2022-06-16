package kyu7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class YouAreASquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        Assertions.assertFalse(YouAreASquare.isSquare(-1), "negative numbers aren't square numbers");
        Assertions.assertFalse(YouAreASquare.isSquare(3), "3 isn't a square number");
        Assertions.assertFalse(YouAreASquare.isSquare(26), "26 isn't a square number");
        Assertions.assertFalse(YouAreASquare.isSquare(17), "17 isn't a square number");

        Assertions.assertTrue(YouAreASquare.isSquare(0), "0 is a square number (0 * 0)");
        Assertions.assertTrue(YouAreASquare.isSquare(4), "4 is a square number (2 * 2)");
        Assertions.assertTrue(YouAreASquare.isSquare(25),"25 is a square number (5 * 5)");
        Assertions.assertTrue(YouAreASquare.isSquare(36),"36 is a square number (6 * 6)");
        Assertions.assertTrue(YouAreASquare.isSquare(121),"25 is a square number (11 * 11)");

    }
}
