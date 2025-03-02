//Level kyu6
//link: https://www.codewars.com/kata/58ad2e9c0e3c08126000003f/train/java

/*
Not so random
Description:
You are a magician. You're going to perform a trick.

You have b black marbles and w white marbles in your magic hat, and an infinite supply of black and white marbles that you can pull out of nowhere.

You ask your audience to repeatedly remove a pair of marbles from your hat.
For each pair removed, you add one marble to the hat according to the following rule until there is only 1 marble left.

If the marbles of the pair that is removed are of the same color, you add a white marble to the hat. Otherwise, if one is black and one is white, you add a black marble.

Given the initial number of black and white marbles in your hat, your trick is to predict the color of the last marble.

Note: A magician may confuse your eyes, but not your mind ;-)
Input/Output

    [input] integer b

Initial number of black marbles in the hat.

1 <= b <= 10^9

    [input] integer w

Initial number of white marbles in the hat.

1 <= w <= 10^9

    [output] a string

"Black" or "White" if you can safely predict the color of the last marble. If not, return "Unsure".
 */

package kyu6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NotSoRandom {
    public static String notSoRandom(int b, int w) {
        int max = (int) Math.pow(10, 9);
        int min = 1;
        if (b < min || b > max || w < min || w > max)
            throw new IllegalArgumentException("The value must be between 1 and 10^9");

        return (b % 2 == 1) ? "Black" : "White";
    }

    @Test
    void tests() {
        Assertions.assertEquals("Black", notSoRandom(1, 1));
        Assertions.assertEquals("White", notSoRandom(2, 1));
        Assertions.assertEquals("Black", notSoRandom(1, 2));
        Assertions.assertEquals("White", notSoRandom(2, 2));
        Assertions.assertEquals("White", notSoRandom(6, 9));
        Assertions.assertEquals("White", notSoRandom(10000, 10000));
        Assertions.assertEquals("Black", notSoRandom(11111, 22222));
    }
}
